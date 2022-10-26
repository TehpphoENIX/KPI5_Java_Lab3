public class BlackFactory implements BaseFactory
{
    @Override
    public Circle createCircle()
    {
        return new BlackCircle();
    }
    @Override
    public Triangle createTriangle()
    {
        return new BlackTriangle();
    }
}
