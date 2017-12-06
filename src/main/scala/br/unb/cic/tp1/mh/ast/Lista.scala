package br.unb.cic.tp1.mh.ast

/**
  * Created by felipecosta on 12/6/17.
  */

class Node[T](var _valor: T) {
    var valor = _valor
    var next: Node[T] = null
    var prev: Node[T] = null


}

class Lista[T] {

}
