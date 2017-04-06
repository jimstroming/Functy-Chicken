public class Payment {

  public final CreditCard cc;
  public final int amount;

  public Payment(CreditCard cc, int amount) {
    this.cc = cc;
    this.amount = amount;
  }

  public Payment combine(Payment other) {
    if (cc.equals(other.cc)) {
      return new Payment(cc, amount + other.amount);
    } else {
      throw new IllegalStateException(
                            "Can't combine payments to different cards");
    }
  }
}
