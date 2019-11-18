/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        char nUsuario;
        
        boolean bucleError = true;

        do {
            System.out.print("Introduce una vocal inglesa MAYÚSCULA : ");

            try {
                nUsuario =  SCN.nextLine().charAt(0);

                System.out.printf("Vocal seleccionada ...................: %c%n", nUsuario);
                
                bucleError = false;
                
                if (nUsuario == 'A' || nUsuario == 'E' || nUsuario == 'I' || nUsuario == 'O' || nUsuario == 'U' ) {
                    bucleError = false;

                } else {
                    bucleError = true;
                    System.out.println("Error: selección incorrecta de vocal.");

                }

            } catch (Exception e) {
                SCN.nextLine();
                System.out.println("Error: Entrada incorrecta.");
            }

        } while (bucleError);

    }
}
