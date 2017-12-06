package br.unb.cic.tp1.mh.ast.ExpressoesBinarias

import br.unb.cic.tp1.mh.ast.ExpBinarias.ExpAnd
import br.unb.cic.tp1.mh.ast.ValorBooleano
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by felipecosta on 12/6/17.
  */
class TesteExpAnd extends FlatSpec with Matchers  {

    "A Boolean value true and a boolean value false" should "be evaluated to ValorBooleano(false)" in {
        val valTrue = ValorBooleano(true)
        val valFalse = ValorBooleano(false)

        val and = ExpAnd(valTrue, valFalse)

        and.avaliar() should be (ValorBooleano(false))
    }


    "A Boolean value true and a boolean value true" should "be evaluated to ValorBooleano(true)" in {
        val valTrue = ValorBooleano(true)
        val valTrue2 = ValorBooleano(true)

        val and = ExpAnd(valTrue, valTrue2)

        and.avaliar() should be (ValorBooleano(true))
    }

}
