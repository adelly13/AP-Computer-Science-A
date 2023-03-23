public class Frog
{
    private int position;
    
    public Frog()
    {
        position = 0;
    }
    
    public Frog(int start)
    {
        position = start;
    }
    
    public void hop()
    {
        position++;
    }
    
    public void hopBack()
    {
        position--;
    }
    
    public void print()
    {
        System.out.println("Position: "+position);
    }
    
    public void hop(int amount)
    {
        amount = Math.abs(amount);
        position += amount;
    }
    
    public void hop(boolean facingForward, int amount)
    {
        amount = Math.abs(amount);
        if(facingForward)
            position += amount;
        else
            position -= amount;
    }
    
    public int getPosition()
    {
        return position;
    }
}