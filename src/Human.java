public class Human {
    private int counterOfTeeth, counterOfEars;
    private String eyesColor;

    public void setCounterOfEars(int counterOfEars)
    {
        this.counterOfEars=counterOfEars;
    }
    public void setCounterOfTeeth(int counterOfTeeth)
    {
        this.counterOfTeeth=counterOfTeeth;
    }
    public   void setEyesColor(String eyesColor)
    {
        this.eyesColor=eyesColor;
    }
    public String getEyesColor()
    {
        return  eyesColor;
    }
    public  int getCounterOfTeeth()
    {
        return counterOfTeeth;
    }

    public int getCounterOfEars()
    {
        return counterOfEars;
    }
}
