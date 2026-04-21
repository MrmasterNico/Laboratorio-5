package Hospital;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        // Crear 6 pacientes
       Paciente p1 = new Paciente(1, "Elena", 42, "F", TipoCancer.CARCINOMA, Estado.EN_TRATAMIENTO);
       Paciente p2 = new Paciente(2, "Ricardo", 58, "M", TipoCancer.MELANOMA, Estado.EN_REMISION);
       Paciente p3 = new Paciente(3, "Isabel", 19, "F", TipoCancer.LEUCEMIA, Estado.EN_TRATAMIENTO);
       Paciente p4 = new Paciente(4, "Mateo", 65, "M", TipoCancer.SARCOMA, Estado.EN_REMISION);
       Paciente p5 = new Paciente(5, "Valeria", 33, "F", TipoCancer.LINFOMA, Estado.EN_TRATAMIENTO);
       Paciente p6 = new Paciente(6, "Hugo", 47, "M", TipoCancer.CARCINOMA, Estado.EN_REMISION);
        // Registrar pacientes
        sistema.registrarPacientes(p1);
        sistema.registrarPacientes(p2);
        sistema.registrarPacientes(p3);
        sistema.registrarPacientes(p4);
        sistema.registrarPacientes(p5);
        sistema.registrarPacientes(p6);

        // Crear exámenes
        Examen e1 = new Examen(1, LocalDate.now(), TipoExamen.RESONANCIA, "Normal");
        Examen e2 = new Examen(2, LocalDate.now(), TipoExamen.BIOPSIA, "Positivo");

        // Asignar a 3 pacientes
        p1.agregarExamen(e1);
        p2.agregarExamen(e2);
        p3.agregarExamen(e1);

        // Crear tratamientos
        Tratamiento t1 = new Tratamiento(TipoTratamiento.QUIMIOTERAPIA, 1, "Quimio1", 6, "Nauseas");
        Tratamiento t2 = new Tratamiento(TipoTratamiento.RADIOTERAPIA, 2, "Radio1", 4, "Fatiga");

        // Asignar tratamientos
        p1.agregarTratamiento(t1);
        p2.agregarTratamiento(t2);
        p3.agregarTratamiento(t1);

        // Mostrar resultados
        sistema.pacientesPorCancer();
        sistema.porcentajePorEstado();
    }
}
