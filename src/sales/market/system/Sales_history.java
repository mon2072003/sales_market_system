
package sales.market.system;

/**
 *
 * @author Abanoub Ezzat
 */
public class Sales_history {
String bill_id;
String total;
String payed;
String remainder;
String date;
String time;

public Sales_history(String bill_id,String total,String payed,String remainder,String date,String time){
this.bill_id=bill_id;
this.total=total;
this.payed=payed;
this.remainder=remainder;
this.date=date;
this.time=time;
  }
}
