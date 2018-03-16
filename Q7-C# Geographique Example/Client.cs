using System;
using System.Xml;
namespace Rextester
{
    public class Program
    {
        public static void Main(string[] args)
        {
		GeoIPService service = new GeoIPService();
         GeoIP tmpIP= service.GetGeoIP("194.57.215.5");
                        Console.WriteLine(tmpIP.CountryName);                    

        }
    }
}
