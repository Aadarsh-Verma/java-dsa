package Hashing;

import java.util.*;
import java.io.*;

public class CAT_EXAM {
    HashMap<Integer, ArrayList<String>> patient = new HashMap<>();
    HashMap<String, ArrayList<String>> doctors = new HashMap<>();

    void insertPatient(int ID, String disease) {
        if (patient.containsKey(ID)) {
            patient.get(ID).add(disease);
        } else {
            ArrayList<String> list = new ArrayList<>();
            patient.put(ID, list);
            patient.get(ID).add(disease);
        }
    }

    void removePatient(int ID) {

        patient.remove(ID);
    }

    void insertDoctor(String disease, String doctor_name) {
        if (doctors.containsKey(disease)) {
            doctors.get(disease).add(doctor_name);
        } else {
            ArrayList<String> list = new ArrayList<>();
            doctors.put(disease, list);
            doctors.get(disease).add(doctor_name);
        }
    }

    ArrayList<String> fetchDoctorsForPatient(Integer ID) {
        ArrayList<String> diseases = patient.get(ID);
        ArrayList<String> patient_doctors = new ArrayList<>();

        for (String dis : diseases) {
            if (doctors.containsKey(dis)) {
                ArrayList<String> docs = doctors.get(dis);
                patient_doctors.addAll(docs);
            }
        }
        return patient_doctors;
    }

    void printPatients() {
        for (Map.Entry<Integer, ArrayList<String>> entry : patient.entrySet()) {


            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    void printDoctors() {
        for (Map.Entry<String, ArrayList<String>> entry : doctors.entrySet()) {

            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        CAT_EXAM r = new CAT_EXAM();
        r.insertPatient(1, "corona");
        r.insertPatient(1, "HIV");
        r.insertPatient(1, "pneumonia");
        r.insertPatient(2, "asthama");
        r.insertPatient(2, "cancer");
        r.insertPatient(2, "corona");

        r.insertDoctor("corona", "mayank");
        r.insertDoctor("HIV", "vikas");
        r.insertDoctor("asthama", "kaustubh");
        r.insertDoctor("cancer", "aadarsh");

        System.out.println("The list of diseases with doctor names ");
        r.printDoctors();
        System.out.println("The list of patient with their disesase is ");
        r.printPatients();
        System.out.println("doctors for patient ID 1");
        System.out.println(r.fetchDoctorsForPatient(1));
        System.out.println("doctors for patient ID 2");
        System.out.println(r.fetchDoctorsForPatient(2));

    }
}
