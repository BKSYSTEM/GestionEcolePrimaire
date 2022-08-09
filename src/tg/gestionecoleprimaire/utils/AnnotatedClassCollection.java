package tg.gestionecoleprimaire.utils;

import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author djim
 */
class AnnotatedClassCollection {
    
    public static List<Class<?>> getAnnotatedClasses() {
        Class<?>[] classes = new Class<?>[]{
//            Niveau.class,
//            Classe.class,
//            Matiere.class,
//            Eleve.class,
//            Enseignement.class,
//            Enseignant.class,
//            Personne.class,
//            Evaluation.class,
//            Periode.class,
//            TypeEvaluation.class,
//            Note.class
        };

        return Arrays.asList(classes);
    }

    private AnnotatedClassCollection() {
        throw new AssertionError("No need to instanciate this class ...");
    }
}
