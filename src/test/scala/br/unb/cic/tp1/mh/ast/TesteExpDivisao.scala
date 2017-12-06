package br.unb.cic.tp1.mh.ast

import br.unb.cic.tp1.exceptions.ExpressaoInvalida
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by felipecosta on 12/6/17.
  */
class TesteExpDivisao extends FlatSpec with Matchers  {


    "An integer value true / an integer value 12" should "throw ExpressaoInvalida" in {
        val valTrue  = ValorBooleano(true)
        val val12 = ValorInteiro(12)

        val div = ExpDivisao(valTrue, val12)
        assertThrows[ExpressaoInvalida] {
            div.avaliar()
        }
    }


    "An integer value 10 / an integer value 5" should "result in InteverValue(2)" in {
        val val5  = ValorInteiro(5)
        val val10 = ValorInteiro(10)

        val div = ExpDivisao(val10, val5)
        div.avaliar() should be (ValorInteiro(2))
    }

    "An integer value 5 / an integer value 2" should "result in InteverValue(2)" in {
        val val5  = ValorInteiro(5)
        val val2 = ValorInteiro(2)

        val div = ExpDivisao(val5, val2)
        div.avaliar() should be (ValorInteiro(2))
    }

}
