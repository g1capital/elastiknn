// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.klibisz.elastiknn

sealed trait Distance extends _root_.scalapb.GeneratedEnum {
  type EnumType = Distance
  def isDistanceInvalid: _root_.scala.Boolean = false
  def isDistanceL1: _root_.scala.Boolean = false
  def isDistanceL2: _root_.scala.Boolean = false
  def isDistanceAngular: _root_.scala.Boolean = false
  def isDistanceHamming: _root_.scala.Boolean = false
  def isDistanceJaccard: _root_.scala.Boolean = false
  def companion: _root_.scalapb.GeneratedEnumCompanion[Distance] = com.klibisz.elastiknn.Distance
}

object Distance extends _root_.scalapb.GeneratedEnumCompanion[Distance] {
  implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Distance] = this
  @SerialVersionUID(0L)
  case object DISTANCE_INVALID extends Distance {
    val value = 0
    val index = 0
    val name = "DISTANCE_INVALID"
    override def isDistanceInvalid: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DISTANCE_L1 extends Distance {
    val value = 1
    val index = 1
    val name = "DISTANCE_L1"
    override def isDistanceL1: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DISTANCE_L2 extends Distance {
    val value = 2
    val index = 2
    val name = "DISTANCE_L2"
    override def isDistanceL2: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DISTANCE_ANGULAR extends Distance {
    val value = 3
    val index = 3
    val name = "DISTANCE_ANGULAR"
    override def isDistanceAngular: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DISTANCE_HAMMING extends Distance {
    val value = 4
    val index = 4
    val name = "DISTANCE_HAMMING"
    override def isDistanceHamming: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DISTANCE_JACCARD extends Distance {
    val value = 5
    val index = 5
    val name = "DISTANCE_JACCARD"
    override def isDistanceJaccard: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  final case class Unrecognized(value: _root_.scala.Int) extends Distance with _root_.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.immutable.Seq(DISTANCE_INVALID, DISTANCE_L1, DISTANCE_L2, DISTANCE_ANGULAR, DISTANCE_HAMMING, DISTANCE_JACCARD)
  def fromValue(value: _root_.scala.Int): Distance = value match {
    case 0 => DISTANCE_INVALID
    case 1 => DISTANCE_L1
    case 2 => DISTANCE_L2
    case 3 => DISTANCE_ANGULAR
    case 4 => DISTANCE_HAMMING
    case 5 => DISTANCE_JACCARD
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = ElastiknnProto.javaDescriptor.getEnumTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = ElastiknnProto.scalaDescriptor.enums(0)
}