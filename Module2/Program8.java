//8.Represent GPSLocation as object
//latitude, longitude, direction, altitude
class GPSLocation
{
    double Latitude;
    double Longitude;
    String Direction;
    double Altitude;
}
class Program8
{
    public static void main(String[] args)
    {
        System.out.println("main method started");

        GPSLocation g1 = new GPSLocation();
        g1.Latitude=12.9716;
        g1.Longitude=77.5946;
        g1.Direction="North";
        g1.Altitude=900;

        System.out.println("GPSLocation.Latitude: "+g1.Latitude);
        System.out.println("GPSLocation.Longitude: "+g1.Longitude);
        System.out.println("GPSLocation.Direction: "+g1.Direction);
        System.out.println("GPSLocation.Altitude: "+g1.Altitude);

        GPSLocation g2 =new GPSLocation();
        g2.Latitude=38.890;
        g2.Longitude=-54.345;
        g2.Direction="South";
        g2.Altitude=500;

        System.out.println("GPSLocation.Latitude: "+g2.Latitude);
        System.out.println("GPSLocation.Longitude: "+g2.Longitude);
        System.out.println("GPSLocation.Direction: "+g2.Direction);
        System.out.println("GPSLocation.Altitude: "+g2.Altitude);
        
        System.out.println("main method ended");
    }
}