import java.util.ArrayList;

public class Canada {
   
   ArrayList<Province> provinceList;
   
   public Canada() {
      
      provinceList = new ArrayList<Province>();
      
      provinceList.add(new Province("Ontario", 13678700, 917741, 158654, 1076395, "English"));
      provinceList.add(new Province("Quebec", 8214700, 1356128, 185928, 1542056, "French"));
      provinceList.add(new Province("Nova Scotia", 942700, 53338, 1946, 55284, "English"));
      provinceList.add(new Province("New Brunswick", 753900, 71450, 1458, 72908, "English and French"));
      provinceList.add(new Province("Manitoba", 1282000, 553556, 94241, 647797, "English"));
      provinceList.add(new Province("British Columbia", 4631300, 925186, 19549, 944735, "English"));
      provinceList.add(new Province("Prince Edward Island", 146300, 5660, 0, 5660, "English"));
      provinceList.add(new Province("Saskatchewan", 1125400, 591670, 59366, 651036, "English"));
      provinceList.add(new Province("Alberta", 4121700, 642317, 19531, 661848, "English"));
      provinceList.add(new Province("Newfoundland and Labrador", 527000, 373872, 31340, 405212, "English"));
      
      //The folowing three are only territories but they still deserve some recognition
      provinceList.add(new Province("Northwest Territories", 41462, 1183085, 163021, 1346106, "French, Chipewyan and Cree"));
      provinceList.add(new Province("Yukon", 33897, 474391, 8052, 482443, "English and French"));
      provinceList.add(new Province("Nunavut", 31906, 1936113, 157077, 2093190, "Inuinnaqtun, English and French"));
   }
   
   public ArrayList<Province> getProvinces() {
      return provinceList;
   }
   
}
