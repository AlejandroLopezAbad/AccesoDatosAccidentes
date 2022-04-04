import java.time.LocalTime;

public class MainConsultas {
    public static void main(String[] args) {

        //Consultas al csv
        //t
        System.out.println("Accidentes en el retiro: ");

        LectorAccidentes.getInstance().getAccidentesList().stream().filter(f-> f.getDistrictonombre().equalsIgnoreCase(
                "RETIRO")).forEach(System.out::println);



        System.out.println("/////////////////////////");
        System.out.println("Accidentes con positivo en drogas:");
        LectorAccidentes.getInstance().getAccidentesList().stream().filter(f-> f.getPositivadroga().equalsIgnoreCase(
                "1")).forEach(System.out::println);

        System.out.println("/////////////////////////");
        System.out.println("Numero Accidentes con positivo en alcohol o drogas:");
        System.out.println(LectorAccidentes.getInstance().getAccidentesList().stream().filter(f ->
                (f.getPositivaalcohol().equalsIgnoreCase("S") ||
                        f.getPositivadroga().equalsIgnoreCase("1"))).count());

        System.out.println("/////////////////////////");
        System.out.println("Numero Accidentes con positivo en alcohol y drogas:");
        System.out.println(LectorAccidentes.getInstance().getAccidentesList().stream().filter(f ->
                (f.getPositivaalcohol().equalsIgnoreCase("S") &&
                        f.getPositivadroga().equalsIgnoreCase("1"))).count());

        System.out.println("/////////////////////////");
        System.out.println("Accidentes en los que haya intervenido un Autobús:");
        LectorAccidentes.getInstance().getAccidentesList().stream().filter(f-> f.getTipovehiculo().contains("Autobús")).forEach(System.out::println);

        System.out.println("/////////////////////////");
        System.out.println("Numero Accidentes por sexo:");
        System.out.println("Mujer: "+LectorAccidentes.getInstance().getAccidentesList().stream().filter(f ->
                (f.getSexo().equalsIgnoreCase("Mujer"))).count());
        System.out.println("Hombre: "+LectorAccidentes.getInstance().getAccidentesList().stream().filter(f ->
                (f.getSexo().equalsIgnoreCase("Hombre"))).count());
        System.out.println("Desconocido: "+LectorAccidentes.getInstance().getAccidentesList().stream().filter(f ->
                (f.getSexo().equalsIgnoreCase("Desconocido"))).count());

        System.out.println("/////////////////////////");
        System.out.println("Numero Accidentes en los que haya fallecido una persona:");
        System.out.println(LectorAccidentes.getInstance().getAccidentesList().stream().filter(f ->
                (f.getLesividad().contains("Fallecido"))).count());


        System.out.println("");
        System.out.println("Accidentes con caida en dia con lluvia debil entre las 8 y las 22 horas:");
        LectorAccidentes.getInstance().getAccidentesList().stream().filter(f->
                        f.getTipoAccidente().contains("Caída") &&
                                f.getHora().isAfter(LocalTime.of(8,0)) &&
                                f.getHora().isBefore(LocalTime.of(22,0))&&
                                f.getEstadometeorológico().equalsIgnoreCase("LLUVIA DÉBIL"))
                .forEach(System.out::println);
    }
}
