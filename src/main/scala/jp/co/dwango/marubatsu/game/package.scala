package jp.co.dwango.marubatsu

import jp.co.dwango.marubatsu.board.{CellState, Empty, Maru => MaruState, Batsu => BatsuState}

package object game {

  def toWinner(cellState: CellState): Winner = cellState match {
    case board.Maru => Maru
    case board.Batsu => Batsu
    case board.Empty => NoWinner
  }

}
