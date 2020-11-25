class Cookie 
{

  public int amount;
  public int temp;
  public int timeBaked;
  public boolean baked;

  Cookie ()
  {
    amount = 0;
    temp = 0;
    timeBaked = 0;
    baked = false;

  }


  Cookie(int anAmount, int aTemp, int aTimeBaked, boolean aBaked)
  {

    amount = anAmount;
    temp = aTemp;
    timeBaked = aTimeBaked;
    baked = aBaked;

  }

  boolean getIsReady()
  {
    return baked;
  }


  void setAmount(int anAmount)
  {
    amount = anAmount;
  }


  void  areBaked(int aTemp, int aTimeBaked)
  {

    temp = aTemp;
    timeBaked = aTimeBaked;
    baked = true;

    System.out.println(amount + " cookies were baked at " + temp +  " degrees F for "+ timeBaked +  " minutes");
  }



}