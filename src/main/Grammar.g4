grammar Grammar;

@header {
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.function.Function;
}

@members {
    private int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}

start returns [List<String> results]
    : resList = eqList[new HashMap<String, Integer>(), new ArrayList<String>()] {
        Collections.reverse($resList.ret); $results = $resList.ret;
    }
    ;

eqList[Map<String, Integer> variables, List<String> results] returns [List<String> ret]
    : e = eq[variables] SEMICOLON eqList[variables, results]* {
        results.add($e.result); $ret = $results;
    }
    ;

eq[Map<String, Integer> variables] returns [String result]
    : VAR EQ expr[variables] {
        variables.put($VAR.text, $expr.val); $result = $VAR.text + " = " + $expr.val;
    }
    ;

expr[Map<String, Integer> variables] returns [int val]
    : term[variables] exprP[variables, $term.val] {
        $val = $exprP.val;
    }
    ;

exprP[Map<String, Integer> variables, int i] returns [int val]
    : {
        $val = $i;
    }
    | PLUS term[variables] e = exprP[variables, i + $term.val] {
        $val = $e.val;
    }
    | MINUS term[variables] e = exprP[variables, i - $term.val] {
        $val = $e.val;
    }
    ;

term[Map<String, Integer> variables] returns [int val]
    : fact[variables] termP[variables, $fact.val] {
        $val = $termP.val;
    }
    ;

termP[Map<String, Integer> variables, int i] returns [int val]
    : {
        $val = $i;
    }
    | MUL fact[variables] e = termP[variables, i * $fact.val] {
        $val = $e.val;
    }
    | DIV fact[variables] e = termP[variables, i / $fact.val] {
        $val = $e.val;
    }
    ;

fact[Map<String, Integer> variables] returns [int val]
    : MINUS atom[variables] {
        $val = -$atom.val;
    }
    | atom[variables] e = factP[variables, $atom.val] {
        $val = $e.val;
    }
    ;

factP[Map<String, Integer> variables, int i] returns [int val]
    : {
        $val = $i;
    }
    | FACTORIAL e = factP[variables, i] {
        $val = factorial($e.val);
    }
    ;

atom[Map<String, Integer> variables] returns[int val]
    : OPEN_BRACKET expr[variables] CLOSE_BRACKET {
        $val = $expr.val;
    }
    | NUMBER {
        $val = Integer.parseInt($NUMBER.text);
    }
    | VAR {
        $val = variables.get($VAR.text);
    }
    ;

OPEN_BRACKET
    : '('
    ;
CLOSE_BRACKET
    : ')'
    ;
PLUS
    : '+'
    ;
MINUS
    : '-'
    ;
MUL
    : '*'
    ;
DIV
    : '/'
    ;
EQ
    : '='
    ;
SEMICOLON
    : ';'
    ;
FACTORIAL
    : '!'
    ;

NUMBER
    : [0]|[1-9]+[0-9]*
    ;
VAR
    : [a-z]
    ;
WS
    : [ \t\r\n]+ -> skip
    ;