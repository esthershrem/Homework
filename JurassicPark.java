public class JurassicPark {
    public static void main(String[] args) {
        Dinosaur dino1 = new Dinosaur("T-Rex", 20.0, 30.0, 12000.0);
        Dinosaur dino2 = new Dinosaur();

        Pterodactyl ptero1 = new Pterodactyl("Ptera", 25.0, 15.0, 800.0, 60);
        Pterodactyl ptero2 = new Pterodactyl("SkyKing");

        Pack pack1 = new Pack(6, "Raptor Squad");

        Velociraptor raptor1 = new Velociraptor("Blue", 12.0, 10.0, 800.0, 40, pack1);
        Velociraptor raptor2 = new Velociraptor("Charlie", 10.0);

        Dinosaur dino3 = new Dinosaur(dino1);
        Pterodactyl ptero3 = new Pterodactyl(ptero1);
        Velociraptor raptor3 = new Velociraptor(raptor1);

        System.out.println(dino1.buildEnclosure());
        System.out.println(dino2.buildEnclosure());
        System.out.println(ptero1.buildEnclosure());
        System.out.println(ptero2.buildEnclosure());
        System.out.println(raptor1.buildEnclosure());
        System.out.println(raptor2.buildEnclosure());

        System.out.println(raptor1.toString());
        System.out.println(raptor2.toString());
    }
}