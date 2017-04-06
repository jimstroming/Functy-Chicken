public class Payment {

  public final CreditCard cc;
  public final int amount;

  public Payment(CreditCard cc, int amount) {
    this.cc = cc;
    this.amount = amount;
  }

  public static Payment combine(Payment payment1, Payment payment2) {
    if (payment1.cc.equals(payment2.cc)) {
      return new Payment(payment1.cc, payment1.amount + payment2.amount);
    } else {
      throw new IllegalStateException(
                            "Can't combine payments to different cards");
    }
  }
}
