package br.unb.cic.tp1.mh.ast.ExpressoesBinarias

import br.unb.cic.tp1.exceptions.ExpressaoInvalida
import br.unb.cic.tp1.mh.ast.ExpBinarias.{ExpSoma, ExpSubtracao}
import br.unb.cic.tp1.mh.ast.{ValorBooleano, ValorInteiro}
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by felipecosta on 12/6/17.
  */
class TesteExpSub extends FlatSpec with Matchers  {


    "An integer value true - an integer value true" should "throw ExpressaoInvalida" in {
        val valTrue  = ValorBooleano(true)

        val sub = ExpSubtracao(valTrue, valTrue)
        assertThrows[ExpressaoInvalida] {
            sub.avaliar()
        }
    }


    "An integer value 5 - an integer value 10" should "result in InteverValue(-5)" in {
        val val5  = ValorInteiro(5)
        val val10 = ValorInteiro(10)

        val sub = ExpSubtracao(val5, val10)
        sub.avaliar() should be (ValorInteiro(-5))

    }


    "An integer value 100 - an integer value 10" should "result in InteverValue(90)" in {
        val val100  = ValorInteiro(100)
        val val10 = ValorInteiro(10)

        val sub = ExpSubtracao(val100, val10)
        sub.avaliar() should be (ValorInteiro(90))

    }

}
