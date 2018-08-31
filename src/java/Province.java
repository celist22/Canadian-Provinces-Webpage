public class Province {
   
   // Name of province
   private String name;
   // Population as of July 204
   private long population;
   // Land area (in squire kilometer)
   private long landArea;
   // Area of water bodies (in squire kilometer)
   private long waterArea;
   // Total area (in squire kilometer)
   private long totalArea;
   // Official languages
   private String officialLanguage;

   public Province(String name, long population,
           long landArea, long waterArea,
           long totalArea, String officialLanguage) {
      this.name = name;
      this.population = population;
      this.landArea = landArea;
      this.waterArea = waterArea;
      this.totalArea = totalArea;
      this.officialLanguage = officialLanguage;
   }

   public String getName() {
      return name;
   }

   public long getPopulation() {
      return population;
   }

   public long getLandArea() {
      return landArea;
   }

   public long getWaterArea() {
      return waterArea;
   }

   public long getTotalArea() {
      return totalArea;
   }

   public String getOfficialLanguage() {
      return officialLanguage;
   }

   @Override
   public String toString() {
      return "Province{" + "name=" + name
              + ", population=" + population
              + ", landArea=" + landArea
              + ", waterArea=" + waterArea
              + ", totalArea=" + totalArea
              + ", officialLanguage=" + officialLanguage + '}';
   }

}


