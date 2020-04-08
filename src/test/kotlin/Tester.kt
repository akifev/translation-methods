import org.junit.Test

class Tester {
    @Test
    fun testEmptyFile() {
        doTest("")
    }

    @Test
    fun testMultiDeclarations() {
        doTest("")
    }

    @Test
    fun testSignatureSyntaxProcedureRJ() {
        doTestWithException("procedure f(x);")
        doTestWithException("procedure f(x)")
        doTestWithException("procedure (x);")
        doTestWithException("procedure f(xreal);")
        doTestWithException("procedure f(x::real);")
        doTestWithException("procedure f x:real);")
        doTestWithException("procedure f(x:real;")
    }

    @Test
    fun testSignatureSyntaxFunctionRJ() {
        doTestWithException("function f(x) : integer;")
        doTestWithException("function f(x) : integer")
        doTestWithException("function (x) : integer;")
        doTestWithException("function f(xreal) : integer;")
        doTestWithException("function f(x::real) : integer;")
        doTestWithException("function f x:real) : integer;")
        doTestWithException("function f(x:real : integer;")
    }

    @Test
    fun testWSPSProcedureAC() {
        doTest("procedure        f    (     x    :  real  )   ;   ")
        doTest("                 procedure        f    (     x    :  real  )   ;   ")
        doTest("procedure f(x:real);")
    }

    @Test
    fun testWSPSFunctionAC() {
        doTest("function        f    (     x    :  real  )  :   real ;   ")
        doTest("                 function        f    (     x    :  real  ) : integer  ;   ")
        doTest("function f(x:real):real;")
    }

    @Test
    fun testNamingFunctionAC() {
        doTest("function FUNCTION(x:real):real;")
        doTest("function FuNcTiOn(x:real):real;")
        doTest("function fUnCtIoN(x:real):real;")
        doTest("function F1236ffdf4dsdfsgsdg(x:real):real;")
        doTest("function f1236ffdf4dsdfsgsdg(x:real):real;")
        doTest("function func(x:REAL):real;")
        doTest("function func(x:ReAl):real;")
        doTest("function func(x:rEaL):real;")
        doTest("function func(x:rEaL):real123dfgd;")
        doTest("function func(xyz123xyz:rEaL):real;")
        doTest("function func(AbCXYZ123xyz, BR0KEN8888NAME:rEaL):real;")
    }

    @Test
    fun testNamingProcedureAC() {
        doTest("procedure FUNCTION(x:real);")
        doTest("procedure FuNcTiOn(x:real);")
        doTest("procedure fUnCtIoN(x:real);")
        doTest("procedure F1236ffdf4dsdfsgsdg(x:real);")
        doTest("procedure f1236ffdf4dsdfsgsdg(x:real);")
        doTest("procedure func(x:REAL);")
        doTest("procedure func(x:ReAl);")
        doTest("procedure func(x:rEaL);")
        doTest("procedure func(xyz123xyz:rEaL);")
        doTest("procedure func(AbCXYZ123xyz, BR0KEN8888NAME:rEaL);")
    }

    @Test
    fun testNamingFunctionRJ() {
        doTestWithException("function function(x:real):real;")
        doTestWithException("function procedure(x:real):real;")
        doTestWithException("function f(procedure:real):real;")
        doTestWithException("function p(x:procedure):real;")
        doTestWithException("function p(x:real):procedure;")
        doTestWithException("function 123function(x:real):real;")
        doTestWithException("function FUNCTION(46x:real):real;")
        doTestWithException("function FuNcTiOn(x:real):132real;")
        doTestWithException("function fUnCtIoN(x:56real):real;")
        doTestWithException("function func(AbCXYZ123xyz, 5BR0KEN8888NAME:rEaL):real;")
    }

    @Test
    fun testNamingProcedureRJ() {
        doTestWithException("procedure function(x:real);")
        doTestWithException("procedure procedure(x:real);")
        doTestWithException("procedure f(procedure:real);")
        doTestWithException("procedure p(x:procedure);")
        doTestWithException("procedure 123function(x:real);")
        doTestWithException("procedure FUNCTION(46x:real);")
        doTestWithException("procedure fUnCtIoN(x:56real);")
        doTestWithException("procedure func(AbCXYZ123xyz, 5BR0KEN8888NAME:rEaL);")
    }

    @Test
    fun testBaseFunctionAC() {
        doTest("function f(): integer;")
        doTest("function fib(n: integer): integer;")
        doTest("function gcd(a: integer; b: integer): integer;")
        doTest("function lca(a, b: integer): integer;")
        doTest("function f1(a, b: integer; c: real): real;")
    }

    @Test
    fun testBaseProcedureAC() {
        doTest("procedure f();")
        doTest("procedure fib(n: integer);")
        doTest("procedure gcd(a: integer; b: integer);")
        doTest("procedure lca(a, b: integer);")
        doTest("procedure f1(a, b: integer; c: real);")
    }

    @Test
    fun testBaseFunctionRJ() {
        doTestWithException("functionf(): integer;")
        doTestWithException("fUnCtIoN fib(n: integer): integer;")
        doTestWithException("function gcd(a: 1nteger; b: integer): integer;")
        doTestWithException("function lca(a, b: integer);")
        doTestWithException("function 1f(a, b: integer; c: real): real;")
    }

    @Test
    fun testBaseProcedureRJ() {
        doTestWithException("proceduref();")
        doTestWithException("pRoCeDuRe fib(n: integer);")
        doTestWithException("procedure gcd(a: 1nteger; b: integer);")
        doTestWithException("procedure lca(a, b: integer): integer;")
        doTestWithException("procedure 1f(a, b: integer; c: real);")
    }

    @Test
    fun testMultiDeclaration() {
        doTest("procedure f();" + "procedure fib(n: integer);" + "procedure gcd(a: integer; b: integer);" + "procedure lca(a, b: integer);" + "procedure f1(a, b: integer; c: real);")
        doTest("procedure f();\n" + "procedure fib(n: integer);\n" + "procedure gcd(a: integer; b: integer);\n" + "procedure lca(a, b: integer);\n" + "procedure f1(a, b: integer; c: real);")
    }

    @Test
    fun testVarDeclarationAC() {
        doTest("procedure f(var n : integer);")
        doTest("procedure f(var a, b : integer);")
        doTest("procedure f(var a, b : integer; var c: real);")
        doTest("procedure f(var a, b, c : integer; d, e: real);")
    }

    @Test
    fun testVarDeclarationRJ() {
        doTestWithException("procedure var(var n : integer);")
        doTestWithException("procedure f(var var, b : integer);")
        doTestWithException("procedure f(var a, var b : integer; var c: real);")
        doTestWithException("procedure var f(var a, b, c : integer; d, e: real);")
    }

    private fun doTest(input: String) {
        var result = ""
        try {
            val tokens = PascalLexer().getTokens(input)
            val root = PascalParser(tokens).parse__FP_DECLARATION()
            result = Visualizer(root).visualize()
        } catch (e: Exception) {
            result = e.message ?: "unexpected exception"
            throw e
        } finally {
            print("------------------------------------")
            print("TEST")
            println("------------------------------------")
            print(input)
            println()
            print("-----------------------------------")
            print("RESULT")
            println("-----------------------------------")
            println(result)
            println()
        }
    }

    private fun doTestWithException(input: String) {
        try {
            doTest(input)
        } catch (e: Exception) {
            return
        }

        assert(false)
    }
}