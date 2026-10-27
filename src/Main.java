import java.sql.SQLException;

void main() throws SQLException {

  CRUD s = new CRUD();
  CRUD b = new CRUD();

  System.out.println("Insertando datos...");
 // s.meterXogadores("Alexander Mostovoi", "Mediocentro", 34);
 //s.meterXogadores("Valeri Karpin", "Interior dereito", 33);
  Serializar.getLista();

  System.out.println("Lendo tabla...");
  b.lerXogadores();

  System.out.println("Formando equipo...");
  b.lerXogador();




    }

