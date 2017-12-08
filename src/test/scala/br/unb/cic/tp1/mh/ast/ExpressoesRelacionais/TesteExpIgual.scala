package br.unb.cic.tp1.mh.ast.ExpressoesRelacionais

import br.unb.cic.tp1.exceptions.ExpressaoInvalida
import br.unb.cic.tp1.mh.ast.ExpBinarias.ExpIgual
import br.unb.cic.tp1.mh.ast.{ValorBooleano, ValorInteiro}
import org.scalatest.{FlatSpec, Matchers}

class TesteExpIgual extends FlatSpec with Matchers  {

  "A Boolean value true == a boolean value false" should "be evaluated to ExpressaoInvalida()" in {
    val valtrue = ValorBooleano(true)
    val valFalse = ValorBooleano(false)

    val igual = ExpIgual(valtrue, valFalse)

    assertThrows[ExpressaoInvalida] {
      igual.avaliar()
    }
  }

  "An Integer value 10 == an Integer value 5" should "be evaluated to ValorBooleano(false)" in {
    val val10 = ValorInteiro(10)
    val val5 = ValorInteiro(5)

    val igual = ExpIgual(val10, val5)

    igual.avaliar() should be (ValorBooleano(false))
  }

  "An Integer value 5 == an Integer value 5" should "be evaluated to ValorBooleano(true)" in {
    val val5 = ValorInteiro(5)

    val igual = ExpIgual(val5, val5)

    igual.avaliar() should be (ValorBooleano(true))
  }
}