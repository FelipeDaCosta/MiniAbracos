package br.unb.cic.tp1.mh.ast

import br.unb.cic.tp1.exceptions.ExpressaoInvalida
import br.unb.cic.tp1.mh.ast
import org.scalatest._

class TesteExpSoma extends FlatSpec with Matchers  {


  "An integer value true + an integer value true" should "throw ExpressaoInvalida" in {
    val valTrue  = ValorBooleano(true)

    val soma = ExpSoma(valTrue, valTrue)
    assertThrows[ExpressaoInvalida] {
      soma.avaliar()
    }
  }


    "An integer value 5 + an integer value 10" should "result in InteverValue(15)" in {
        val val5  = ValorInteiro(5)
        val val10 = ValorInteiro(10)

        val soma = ExpSoma(val5, val10)
        soma.avaliar() should be (ValorInteiro(15))

    }

}
