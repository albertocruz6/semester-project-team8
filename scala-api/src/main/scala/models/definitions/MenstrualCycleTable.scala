package models.definitions


import slick.jdbc.PostgresProfile.api._
import java.sql.Date
import models.MenstrualCycleModels.MenstrualCycle
// TODO: Fix Error
class MenstrualCycleTable(tag:Tag) extends Table[MenstrualCycle](tag, "menstrual_cycle"){
  
  def id = column[Long]("id")
  def calendar_id = column[Long]("calendar_id")
  def start_date = column[Date]("start_date")
  def end_date = column[Date]("end_date")
  def bleed_start = column[Date]("bleed_start")
  def bleed_end = column[Date]("bleed_end")
  def * =
    (id.?, calendar_id.?, start_date.?, end_date.?, bleed_start, bleed_end) <> ((MenstrualCycle.apply _).tupled,MenstrualCycle.unapply)

}