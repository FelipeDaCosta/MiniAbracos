package br.unb.cic.tp1.mh.ast.ExpressoesBinarias

import br.unb.cic.tp1.exceptions.ExpressaoInvalida
import br.unb.cic.tp1.mh.ast.ExpBinarias.ExpMultiplicacao
import br.unb.cic.tp1.mh.ast.{ValorBooleano, ValorInteiro}
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by felipecosta on 12/6/17.
  */
class TesteExpMult extends FlatSpec with Matchers  {


    "An integer value true * an integer value 12" should "throw ExpressaoInvalida" in {
        val valTrue  = ValorBooleano(true)
        val val12 = ValorInteiro(12)

        val mult = ExpMultiplicacao(valTrue, val12)
        assertThrows[ExpressaoInvalida] {
            mult.avaliar()
        }
    }


    "An integer value 10 * an integer value 5" should "result in InteverValue(50)" in {
        val val5  = ValorInteiro(5)
        val val10 = ValorInteiro(10)

        val mult = ExpMultiplicacao(val10, val5)
        mult.avaliar() should be (ValorInteiro(50))
    }

    "An integer value 5 * an integer value 2" should "result in InteverValue(10)" in {
        val val5  = ValorInteiro(5)
        val val2 = ValorInteiro(2)

        val mult = ExpMultiplicacao(val5, val2)
        mult.avaliar() should be (ValorInteiro(10))
    }

}
