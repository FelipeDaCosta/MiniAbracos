package br.unb.cic.tp1.mh.ast.ExpressoesRelacionais

import br.unb.cic.tp1.exceptions.ExpressaoInvalida
import br.unb.cic.tp1.mh.ast.ExpBinarias.ExpMaiorIgual
import br.unb.cic.tp1.mh.ast.{ValorBooleano, ValorInteiro}
import org.scalatest.{FlatSpec, Matchers}

class TesteExpMaiorIgual extends FlatSpec with Matchers  {

  "A Boolean value true >= a boolean value false" should "be evaluated to ExpressaoInvalida()" in {
    val valtrue = ValorBooleano(true)
    val valFalse = ValorBooleano(false)

    val maiorIgual = ExpMaiorIgual(valtrue, valFalse)

    assertThrows[ExpressaoInvalida] {
      maiorIgual.avaliar()
    }
  }

  "An Integer value 10 >= an Integer value 10" should "be evaluated to ValorBooleano(true)" in {
    val val10 = ValorInteiro(10)

    val maiorIgual = ExpMaiorIgual(val10, val10)

    maiorIgual.avaliar() should be (ValorBooleano(true))
  }

  "An Integer value 10 >= an Integer value 1" should "be evaluated to ValorBooleano(true)" in {
    val val10 = ValorInteiro(10)
    val val1 = ValorInteiro(1)

    val maiorIgual = ExpMaiorIgual(val10, val1)

    maiorIgual.avaliar() should be (ValorBooleano(true))
  }

  "An Integer value 5 >= an Integer value 10" should "be evaluated to ValorBooleano(false)" in {
    val val5 = ValorInteiro(5)
    val val10 = ValorInteiro(10)

    val maiorIgual = ExpMaiorIgual(val5, val10)

    maiorIgual.avaliar() should be (ValorBooleano(false))
  }
}