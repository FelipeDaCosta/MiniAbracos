package br.unb.cic.tp1.mh.ast.ExpressoesRelacionais

import br.unb.cic.tp1.exceptions.ExpressaoInvalida
import br.unb.cic.tp1.mh.ast.ExpBinarias.ExpMenorIgual
import br.unb.cic.tp1.mh.ast.{ValorBooleano, ValorInteiro}
import org.scalatest.{FlatSpec, Matchers}

class TesteExpMenorIgual extends FlatSpec with Matchers  {

  "A Boolean value true <= a boolean value false" should "be evaluated to ExpressaoInvalida()" in {
    val valtrue = ValorBooleano(true)
    val valFalse = ValorBooleano(false)

    val menorIgual = ExpMenorIgual(valtrue, valFalse)

    assertThrows[ExpressaoInvalida] {
      menorIgual.avaliar()
    }
  }

  "An Integer value 10 <= an Integer value 5" should "be evaluated to ValorBooleano(false)" in {
    val val10 = ValorInteiro(10)
    val val5 = ValorInteiro(5)

    val menorIgual = ExpMenorIgual(val10, val5)

    menorIgual.avaliar() should be (ValorBooleano(false))
  }

  "An Integer value 5 <= an Integer value 10" should "be evaluated to ValorBooleano(true)" in {
    val val5 = ValorInteiro(5)
    val val10 = ValorInteiro(10)

    val menorIgual = ExpMenorIgual(val5, val10)

    menorIgual.avaliar() should be (ValorBooleano(true))
  }
}