grammar Grammar;

s returns [Grammar g]
@init {
    $g = new Grammar();
} :
    file[$g] EOF
    ;

file[Grammar g] :
    documentComment[$g]?
    header[$g]?
    members[$g]?
    (
        state_declaration {
            $g.addState($state_declaration.state);
        }
    )*
    (
        token_declaration {
            $g.addToken($token_declaration.token);
        }
    )*
    ;

documentComment[Grammar g] :
    GRAMMAR WORD SEMICOLON {
        $g.setName($WORD.text);
    }
    ;

header[Grammar g]
locals [StringBuilder code]
@init {
    $code = new StringBuilder();
} :
    HEADER code_block[$code] {
        $g.setHeader($code.toString());
    }
    ;

members[Grammar g]
locals [StringBuilder code]
@init {
    $code = new StringBuilder();
} :
    MEMBERS code_block[$code] {
        $g.setMembers($code.toString());
    }
    ;

state_declaration returns [State state]
locals [StringBuilder code]
@init {
    $code = new StringBuilder();
    $state = new State();
} :
    WORD {
        $state.setName($WORD.text);
    }
    (SQUARE_OPEN_BRACKET state_parameters[$state] SQUARE_CLOSE_BRACKET)?
    (RETURNS SQUARE_OPEN_BRACKET state_returns[$state] SQUARE_CLOSE_BRACKET)?
    (LOCALS SQUARE_OPEN_BRACKET state_locals[$state] SQUARE_CLOSE_BRACKET)?
    (
        INIT code_block[$code] {
            $state.setInit($code.toString());
        }
    )?
    COLON
    state_rule {
        $state.addRule($state_rule.rule);
    }
    (
        OR state_rule {
            $state.addRule($state_rule.rule);
        }
    )*
    SEMICOLON
    ;

state_parameters[State state] :
    type=WORD name=WORD {
        $state.addParameter($type.text, $name.text);
    }
    (
        COMMA type=WORD name=WORD {
            $state.addParameter($type.text, $name.text);
        }
    )*
    ;

state_returns[State state] :
    type=WORD name=WORD {
        $state.addReturn($type.text, $name.text);
    }
    (
        COMMA type=WORD name=WORD {
            $state.addReturn($type.text, $name.text);
        }
    )*
    ;

state_locals[State state] :
    type=WORD name=WORD {
        $state.addLocal($type.text, $name.text);
    }
    (
        COMMA type=WORD name=WORD {
            $state.addLocal($type.text, $name.text);
        }
    )*
    ;

state_rule returns [Rule rule]
@init {
    $rule = new Rule();
} :
    (
        item {
            $rule.addItem($item.i);
        }
    )*
    ;

item returns [Item i]
locals [StringBuilder code, StringBuilder params]
@init {
    $i = new Item();
    $code = new StringBuilder();
    $params = new StringBuilder();
} :
    WORD {
        $i.setName($WORD.text);
    }
    (
        parameter_block[$params] {
            $i.setParameters($params.toString());
        }
        )?
    (
        code_block[$code] {
            $i.setCode($code.toString());
        }
    )?
    ;

code_block[StringBuilder sb] :
    CODE_TEXT {
        String codeText = $CODE_TEXT.text;
        $sb.append(codeText.substring(2, codeText.length() - 2));
    }
    ;

parameter_block[StringBuilder sb] :
    PARAMETER_TEXT {
        String paramText = $PARAMETER_TEXT.text;
        $sb.append(paramText.substring(2, paramText.length() - 2));
    }
    ;

token_declaration returns [StateToken token] :
    WORD COLON REGEX SEMICOLON {
        String regex = $REGEX.text;
        $token = new StateToken($WORD.text, regex.substring(1, regex.length() - 1));
    }
    ;

GRAMMAR : 'grammar';
HEADER : '@header';
MEMBERS : '@members';
INIT : '@init';
RETURNS : 'returns';
LOCALS : 'locals';

SKIPPING : '-> skip';

OPEN_BRACKET : '(';
CLOSE_BRACKET : ')';

SQUARE_OPEN_BRACKET : '[';
SQUARE_CLOSE_BRACKET : ']';

COLON : ':';
COMMA : ',';
SEMICOLON : ';';
OR : '|';

WORD : [a-zA-Z][a-zA-Z0-9_]*('.'[a-zA-Z][a-zA-Z0-9_]*)?;

REGEX : '\'' (~('\'' | '\n' | '\\') | '\\\\' | '\\\'' | '\\.')+ '\'';
CODE_TEXT : '\\{' .*? '\\}';
PARAMETER_TEXT : '\\[' .*? '\\]';
WS: [ \n\t\r]+ -> skip;