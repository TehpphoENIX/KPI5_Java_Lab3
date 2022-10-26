public class WhiteFactory implements BaseFactory
{
    @Override
    public Circle createCircle()
    {
        return new WhiteCircle();
    }
    @Override
    public Triangle createTriangle()
    {
        return new WhiteTriangle();
    }
}
