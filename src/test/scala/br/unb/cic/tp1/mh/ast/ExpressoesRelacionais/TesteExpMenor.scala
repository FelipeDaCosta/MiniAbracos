package br.unb.cic.tp1.mh.ast.ExpressoesRelacionais

import br.unb.cic.tp1.exceptions.ExpressaoInvalida
import br.unb.cic.tp1.mh.ast.ExpBinarias.ExpMenor
import br.unb.cic.tp1.mh.ast.{ValorBooleano, ValorInteiro}
import org.scalatest.{FlatSpec, Matchers}

class TesteExpMenor extends FlatSpec with Matchers  {

  "A Boolean value true < a boolean value false" should "be evaluated to ExpressaoInvalida()" in {
    val valtrue = ValorBooleano(true)
    val valFalse = ValorBooleano(false)

    val menor = ExpMenor(valtrue, valFalse)

    assertThrows[ExpressaoInvalida] {
      menor.avaliar()
    }
  }

  "An Integer value 10 < an Integer value 5" should "be evaluated to ValorBooleano(false)" in {
    val val10 = ValorInteiro(10)
    val val5 = ValorInteiro(5)

    val menor = ExpMenor(val10, val5)

    menor.avaliar() should be (ValorBooleano(false))
  }

  "An Integer value 5 < an Integer value 10" should "be evaluated to ValorBooleano(true)" in {
    val val5 = ValorInteiro(5)
    val val10 = ValorInteiro(10)

    val menor = ExpMenor(val5, val10)

    menor.avaliar() should be (ValorBooleano(true))
  }
}