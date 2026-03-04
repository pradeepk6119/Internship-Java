//7.Represent 2DGraphPoint as object
//xaxis and yaxis
class GraphPoint
{
    int xaxis;
    int yaxis;
}
class Program7
{
    public static void main(String[] args)
    {
        System.out.println("main method started");

        GraphPoint g1 = new GraphPoint();
        g1.xaxis=10;
        g1.yaxis=20;

        System.out.println("GraphPoint.Xaxis: "+g1.xaxis);
        System.out.println("GraphPoint.Yaxis: "+g1.yaxis);

        System.out.println("main method ended");
    }
}