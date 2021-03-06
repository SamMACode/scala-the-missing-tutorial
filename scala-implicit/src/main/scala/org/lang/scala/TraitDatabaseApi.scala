package org.lang.scala

/**
 * @author Sam Ma
 * @date 2020/06/11
 * 使用scala编写数据库的api, 该api与java api较为类似
 */
package database_api {

  case class InvalidColumnName(name: String) extends RuntimeException(s"invalid column name $name")

  trait Row {
    def getInt(columnName: String): Int

    def getDouble(colName: String): Double

    def getText(colName: String): String
  }

}

