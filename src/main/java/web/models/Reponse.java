package web.models;

public class Reponse {
	
	// ----------------- propriétés 6. // statut de l'opération
private int status;
// la réponse JSON
private Object data;
// ---------------constructeurs
public Reponse() {
}
public Reponse(int status, Object data) {
this.status = status;
this.data = data;
}
// méthodes
public void incrStatusBy(int increment) {
status += increment;
}

// ---getters et setters : DOIT IMPERATIVEMENT ETRE CREE POUR ENVOYER LES DONNEES AUTOMATIQUEMENT par springboot

public long getStatus() {
    return status;
}
public Object getData() {
    return data;
}

}
