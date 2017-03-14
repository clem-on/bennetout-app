/**
 * Code généré par WinDev Mobile Express - NE PAS MODIFIER !
 * Objet WinDev Mobile Express : Fenêtre
 * Classe Android : EXPRESS_Wifi
 * Date : 14/03/2017 13:38:47
 * Version de wdjava.dll  : 21.0.118.0
 */


package com.masociete.express_bennetout.wdgen;


import com.masociete.express_bennetout.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.zr.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.core.parcours.chaine.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.champs.slidingmenu.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFEXPRESS_Wifi extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de EXPRESS_Wifi
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_Activer
 */
class GWDBTN_Activer extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_Wifi.BTN_Activer
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2938226589755225323l);

super.setChecksum("1086220687");

super.setNom("BTN_Activer");

super.setType(4);

super.setLibelle("Activer le Wifi");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(14, 15);

super.setTailleInitiale(48, 210);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(4);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0x0, creerPolice_GEN("Droid Sans", -8.000000, 0));

super.setStyleLibelleSurvol(0x0, creerPolice_GEN("Droid Sans", -8.000000, 0));

super.setStyleLibelleEnfonce(0x0, creerPolice_GEN("Droid Sans", -8.000000, 0));

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x191919, 0x0, 0xCECECE, 4, 4, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x191919, 0x0, 0xCECECE, 4, 4, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x191919, 0x0, 0xCECECE, 4, 4, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 10, 9);

super.setImageFond("C:\\WINDEV Mobile 21 Express\\Exemples\\Android\\Android Système\\images\\boutton_4etats_transparent.png?E4_3NP_9_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de BTN_Activer
 */
public void init()
{
super.init();

// SI WiFiEtat() = wifiDésactivé ALORS
if(WDAPIWiFi.wifiEtat().opEgal(4))
{
// 	BTN_Activer = "Activer le Wifi"
this.setValeur("Activer le Wifi");

// 	BTN_Actualiser..Etat = Grisé
mWD_BTN_Actualiser.setEtat(4);

}
else
{
// 	BTN_Activer = "Désactiver le Wifi"
this.setValeur("Désactiver le Wifi");

// 	BTN_Actualiser..Etat = Actif
mWD_BTN_Actualiser.setEtat(0);

}

}




/**
 * Traitement: Clic sur BTN_Activer
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// Sablier(Vrai)
WDAPIDivers.sablier(true);

// SI WiFiEtat() = wifiDésactivé ALORS
if(WDAPIWiFi.wifiEtat().opEgal(4))
{
// 	WiFiActive(Vrai)
WDAPIWiFi.wifiActive(true);

// 	BTN_Activer = "Activation en cours"
this.setValeur("Activation en cours");

// 	TantQue WiFiEtat() = wifiActivationEnCours OU WiFiEtat() = wifiDésactivé
while((WDAPIWiFi.wifiEtat().opEgal(2) | WDAPIWiFi.wifiEtat().opEgal(4)))
{
}

}
else
{
// 	WiFiActive(Faux)
WDAPIWiFi.wifiActive(false);

// 	BTN_Activer = "Désactivation en cours"
this.setValeur("Désactivation en cours");

// 	TANTQUE WiFiEtat() = wifiDésactivationEnCours OU WiFiEtat() = wifiActif
while((WDAPIWiFi.wifiEtat().opEgal(3) | WDAPIWiFi.wifiEtat().opEgal(1)))
{
// 		Multitâche(-5)
WDAPIVM.multitache(-5);

}

}

// Actualise()
fWD_actualise();

// Sablier(Faux)
WDAPIDivers.sablier(false);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Activer mWD_BTN_Activer;

/**
 * ZR_RéseauWifiDispo
 */
class GWDZR_ReseauWifiDispo extends WDZoneRepetee
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_Wifi.ZR_RéseauWifiDispo
////////////////////////////////////////////////////////////////////////////

/**
 * ATT_SSID
 */
class GWDATT_SSID extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_Wifi.ZR_RéseauWifiDispo.ATT_SSID
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_SSID");

super.setChampAssocie(mWD_LIB_SSID);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_Wifi.ZR_RéseauWifiDispo.ATT_SSID

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_SSID mWD_ATT_SSID = new GWDATT_SSID();

/**
 * ATT_Sécurité
 */
class GWDATT_Securite extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_Wifi.ZR_RéseauWifiDispo.ATT_Sécurité
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Sécurité");

super.setChampAssocie(mWD_LIB_Securite);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_Wifi.ZR_RéseauWifiDispo.ATT_Sécurité

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Securite mWD_ATT_Securite = new GWDATT_Securite();

/**
 * ATT_Puissance
 */
class GWDATT_Puissance extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_Wifi.ZR_RéseauWifiDispo.ATT_Puissance
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Puissance");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_Wifi.ZR_RéseauWifiDispo.ATT_Puissance

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Puissance mWD_ATT_Puissance = new GWDATT_Puissance();

/**
 * ATT_Identifiant
 */
class GWDATT_Identifiant extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de EXPRESS_Wifi.ZR_RéseauWifiDispo.ATT_Identifiant
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Identifiant");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_Wifi.ZR_RéseauWifiDispo.ATT_Identifiant

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Identifiant mWD_ATT_Identifiant = new GWDATT_Identifiant();

/**
 * ATT_BSSID
 */
class GWDATT_BSSID extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de EXPRESS_Wifi.ZR_RéseauWifiDispo.ATT_BSSID
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_BSSID");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_Wifi.ZR_RéseauWifiDispo.ATT_BSSID

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_BSSID mWD_ATT_BSSID = new GWDATT_BSSID();

/**
 * ATT_Connecte
 */
class GWDATT_Connecte extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de EXPRESS_Wifi.ZR_RéseauWifiDispo.ATT_Connecte
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Connecte");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_Wifi.ZR_RéseauWifiDispo.ATT_Connecte

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Connecte mWD_ATT_Connecte = new GWDATT_Connecte();

/**
 * ATT_ImagePuissance
 */
class GWDATT_ImagePuissance extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de EXPRESS_Wifi.ZR_RéseauWifiDispo.ATT_ImagePuissance
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_ImagePuissance");

super.setChampAssocie(mWD_IMG_Puissance);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_Wifi.ZR_RéseauWifiDispo.ATT_ImagePuissance

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_ImagePuissance mWD_ATT_ImagePuissance = new GWDATT_ImagePuissance();

/**
 * ATT_ImageConnecté
 */
class GWDATT_ImageConnecte extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de EXPRESS_Wifi.ZR_RéseauWifiDispo.ATT_ImageConnecté
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_ImageConnecté");

super.setChampAssocie(mWD_IMG_Actif);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_Wifi.ZR_RéseauWifiDispo.ATT_ImageConnecté

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_ImageConnecte mWD_ATT_ImageConnecte = new GWDATT_ImageConnecte();

/**
 * LIB_SSID
 */
class GWDLIB_SSID extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de EXPRESS_Wifi.ZR_RéseauWifiDispo.LIB_SSID
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2938226589755880683l);

super.setChecksum("1086875591");

super.setNom("LIB_SSID");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("SSID");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(9, 8);

super.setTailleInitiale(21, 257);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x996600, 0xFFFFFFFF, creerPolice_GEN("Droid Sans", -8.000000, 1), 3);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xDDDDDD, 0x5D5D5D, 0xFFFFFFFF, 4, 4, 1, 1));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_SSID mWD_LIB_SSID = new GWDLIB_SSID();

/**
 * LIB_Sécurité
 */
class GWDLIB_Securite extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de EXPRESS_Wifi.ZR_RéseauWifiDispo.LIB_Sécurité
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2938226589755946219l);

super.setChecksum("1086941127");

super.setNom("LIB_Sécurité");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Sécurité");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(35, 8);

super.setTailleInitiale(21, 257);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x0, 0xFFFFFFFF, creerPolice_GEN("Droid Sans", -8.000000, 0), 3);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xDDDDDD, 0x5D5D5D, 0xFFFFFFFF, 4, 4, 1, 1));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Securite mWD_LIB_Securite = new GWDLIB_Securite();

/**
 * IMG_Puissance
 */
class GWDIMG_Puissance extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de EXPRESS_Wifi.ZR_RéseauWifiDispo.IMG_Puissance
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2938226589756011755l);

super.setChecksum("1087008943");

super.setNom("IMG_Puissance");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(22, 271);

super.setTailleInitiale(38, 38);

super.setValeurInitiale("C:\\WINDEV Mobile 21 Express\\Exemples\\Android\\Android Système\\stat_sys_wifi_signal_0.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(1, 0, true, 2500);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(true);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xDDDDDD, 0x5D5D5D, 0xFFFFFFFF, 4, 4, 0, 1));


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_Puissance mWD_IMG_Puissance = new GWDIMG_Puissance();

/**
 * IMG_Actif
 */
class GWDIMG_Actif extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de EXPRESS_Wifi.ZR_RéseauWifiDispo.IMG_Actif
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2938226589756077291l);

super.setChecksum("1087074479");

super.setNom("IMG_Actif");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(6, 266);

super.setTailleInitiale(11, 47);

super.setValeurInitiale("C:\\WINDEV Mobile 21 Express\\Exemples\\Android\\Android Système\\button_onoff_indicator_off.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(3, 0, true, 2500);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(true);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xDDDDDD, 0x5D5D5D, 0xFFFFFFFF, 4, 4, 0, 1));


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_Actif mWD_IMG_Actif = new GWDIMG_Actif();
/**
 * Initialise tous les champs de EXPRESS_Wifi.ZR_RéseauWifiDispo
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_Wifi.ZR_RéseauWifiDispo
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ATT_SSID.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_SSID);
mWD_ATT_Securite.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Securite);
mWD_ATT_Puissance.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Puissance);
mWD_ATT_Identifiant.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Identifiant);
mWD_ATT_BSSID.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_BSSID);
mWD_ATT_Connecte.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Connecte);
mWD_ATT_ImagePuissance.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_ImagePuissance);
mWD_ATT_ImageConnecte.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_ImageConnecte);
mWD_LIB_SSID.initialiserObjet();
super.ajouterChamp("LIB_SSID",mWD_LIB_SSID);
mWD_LIB_Securite.initialiserObjet();
super.ajouterChamp("LIB_Sécurité",mWD_LIB_Securite);
mWD_IMG_Puissance.initialiserObjet();
super.ajouterChamp("IMG_Puissance",mWD_IMG_Puissance);
mWD_IMG_Actif.initialiserObjet();
super.ajouterChamp("IMG_Actif",mWD_IMG_Actif);
creerAttributAuto();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,320,64);
super.setQuid(2938226589755290859l);

super.setChecksum("1086298079");

super.setNom("ZR_RéseauWifiDispo");

super.setType(30);

super.setLibelle("&Zone répétée");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(76, 0);

super.setTailleInitiale(384, 320);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000);

super.setNumTab(2);

super.setModeAscenseur(1, 1);

super.setModeSelection(99);

super.setSaisieEnCascade(false);

super.setLettreAppel(65535);

super.setEnregistrementSortieLigne(true);

super.setPersistant(false);

super.setParamAffichage(0, 1, 317, 64);

super.setBtnEnrouleDeroule(false);

super.setScrollRapide(false, null);

super.setDeplacementParDnd(0);

super.setSwipe(0, "", false, false, "", false, false);

super.setRecyclageChamp(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xDDDDDD, 0x5D5D5D, 0xFFFFFFFF, 4, 4, 1, 1));

super.setStyleSeparateurVerticaux(true, 0xDDDDDD);

super.setStyleSeparateurHorizontaux(1, 0x999999);

super.setDessinerLigneVide(false);

super.setCadreCelluleSelection(WDCadreFactory.creerCadre_GEN("##SYSTEM##C:\\WINDEV Mobile 21 Express\\Exemples\\Android\\Android Système\\Gabarits\\WM\\170 ActivAndroid 4-HoloLight\\ActivAndroid 4-HoloLight_Select.png?E5_3NP_4_4_4_4", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {4, 4, 4, 4}, 0xEFD385, 1, 5));

super.setCouleurCellule(0xFFFFFFFF, 0xFFFFFFFF, 0x0, 0xEFD385);

super.setCadreFondLigne(WDCadreFactory.creerCadre_GEN("", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {4, 4, 4, 4}, 0xFFFFFFFF, 0, 5));

super.setImagePlusMoins("");

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de ZR_RéseauWifiDispo
 */
public void init()
{
super.init();

// Actualise()
fWD_actualise();

}




/**
 * Traitement: Affichage d'une ligne de ZR_RéseauWifiDispo
 */
public void affichageLigne()
//  Affichage de la puissance
{
super.affichageLigne();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_nPuissance = new WDEntier();



// nPuissance est un entier = ATT_Puissance

vWD_nPuissance.setValeur(mWD_ATT_Puissance);


// Si nPuissance < -90 ALORS
if(vWD_nPuissance.opInf(-90))
{
// 	ATT_ImagePuissance = IMG_P1
mWD_ATT_ImagePuissance.setValeur(mWD_IMG_P1);

}
else
{
// 	SI nPuissance < -75 ALORS
if(vWD_nPuissance.opInf(-75))
{
// 		ATT_ImagePuissance = IMG_P2
mWD_ATT_ImagePuissance.setValeur(mWD_IMG_P2);

}
else
{
// 		SI nPuissance < -60 ALORS
if(vWD_nPuissance.opInf(-60))
{
// 			ATT_ImagePuissance = IMG_P3
mWD_ATT_ImagePuissance.setValeur(mWD_IMG_P3);

}
else
{
// 			ATT_ImagePuissance = IMG_P4
mWD_ATT_ImagePuissance.setValeur(mWD_IMG_P4);

}

}

}

// SI ATT_Connecte = "Connecté" ALORS
if(mWD_ATT_Connecte.opEgal("Connecté"))
{
// 	ATT_ImageConnecté = IMG_On
mWD_ATT_ImageConnecte.setValeur(mWD_IMG_On);

}
else
{
// 	ATT_ImageConnecté = IMG_Off
mWD_ATT_ImageConnecte.setValeur(mWD_IMG_Off);

}

}




/**
 * Traitement: Sélection d'une ligne de ZR_RéseauWifiDispo
 */
public void selectionLigne()
{
super.selectionLigne();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sIdentifiant = new WDChaineU();

WDObjet vWD_sMotDePasse = new WDChaineU();

WDObjet vWD_bRes = new WDBooleen();



// sIdentifiant est une chaine


// sMotDePasse est une chaine


// bRes est un booleen


// sIdentifiant = ATT_Identifiant
vWD_sIdentifiant.setValeur(mWD_ATT_Identifiant);

// SI ATT_Connecte <> "Connecté" ALORS
if(mWD_ATT_Connecte.opDiff("Connecté"))
{
// 	SELON Dialogue("Voulez-vous vous connecter à ce réseau WIFI %1 ?", ATT_SSID)
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
WDObjet _WDExpSelon0 = WDAPIDialogue.dialogue(0,new String[] {mWD_ATT_SSID.getString()} );
if(_WDExpSelon0.opEgal(1))
{
// 			SI sIdentifiant <> "" ALORS
if(vWD_sIdentifiant.opDiff(""))
{
// 				bRes = WiFiConnecte(sIdentifiant) 
vWD_bRes.setValeur(WDAPIWiFi.wifiConnecte(vWD_sIdentifiant.getString()));

}
else
{
// 				sSécurité est une chaîne
WDObjet vWD_sSecurite = new WDChaineU();



// 				SI ATT_Sécurité = "Non sécurisé" ALORS
if(mWD_ATT_Securite.opEgal("Non sécurisé"))
{
// 					sSécurité = wifiSecuritéAucune
vWD_sSecurite.setValeur("NONE");

}
else
{
// 					sSécurité = ATT_Sécurité
vWD_sSecurite.setValeur(mWD_ATT_Securite);

}

// 				SI sSécurité <> wifiSecuritéAucune ALORS
if(vWD_sSecurite.opDiff("NONE"))
{
// 					SELON Saisie("Veuillez entrer le mot de passe",sMotDePasse)
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
WDObjet _WDExpSelon1 = WDAPIDialogue.saisie("Veuillez entrer le mot de passe",vWD_sMotDePasse);
if(_WDExpSelon1.opEgal(1))
{
// 							sIdentifiant = WiFiAjouteReseau(ATT_SSID, ATT_BSSID, sSécurité, sMotDePasse, Faux)
vWD_sIdentifiant.setValeur(WDAPIWiFi.wifiAjouteReseau(mWD_ATT_SSID.getString(),mWD_ATT_BSSID.getString(),vWD_sSecurite.getString(),vWD_sMotDePasse.getString(),false));

}
else if(_WDExpSelon1.opEgal(2))
{
}

}

}
else
{
// 					sIdentifiant = WiFiAjouteReseau(ATT_SSID, ATT_BSSID, sSécurité, "", Faux)
vWD_sIdentifiant.setValeur(WDAPIWiFi.wifiAjouteReseau(mWD_ATT_SSID.getString(),mWD_ATT_BSSID.getString(),vWD_sSecurite.getString(),"",false));

}

// 				SI sIdentifiant <> ""  ALORS
if(vWD_sIdentifiant.opDiff(""))
{
// 					bRes = WiFiConnecte(sIdentifiant)
vWD_bRes.setValeur(WDAPIWiFi.wifiConnecte(vWD_sIdentifiant.getString()));

}

}

// 			SI bRes ALORS
if(vWD_bRes.getBoolean())
{
// 				Info("Connexion établie.")
WDAPIDialogue.info("Connexion établie.");

}
else
{
// 				Info("Connexion non établie.")
WDAPIDialogue.info("Connexion non établie.");

}

}

}

}
else
{
// 	SELON Dialogue("Voulez-vous vous déconnecter?")
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
WDObjet _WDExpSelon2 = WDAPIDialogue.dialogue(1);
if(_WDExpSelon2.opEgal(1))
{
// 			WiFiSupprimeReseau(sIdentifiant)
WDAPIWiFi.wifiSupprimeReseau(vWD_sIdentifiant.getString());

// 			Actualise()
fWD_actualise();

}

}

}

// Actualise()
fWD_actualise();

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
super.activerEcouteurAffichageLigne();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZR_ReseauWifiDispo mWD_ZR_ReseauWifiDispo;

/**
 * BTN_Actualiser
 */
class GWDBTN_Actualiser extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_Wifi.BTN_Actualiser
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2938226589756142827l);

super.setChecksum("1087138191");

super.setNom("BTN_Actualiser");

super.setType(4);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(14, 235);

super.setTailleInitiale(48, 71);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(4);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000);

super.setNumTab(3);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("C:\\WINDEV Mobile 21 Express\\Exemples\\Android\\Android Système\\ic_menu_refresh.png", 0, 2);

super.setStyleLibelleRepos(0x0, creerPolice_GEN("Droid Sans", -8.000000, 0));

super.setStyleLibelleSurvol(0x0, creerPolice_GEN("Droid Sans", -8.000000, 0));

super.setStyleLibelleEnfonce(0x0, creerPolice_GEN("Droid Sans", -8.000000, 0));

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x191919, 0x0, 0xCECECE, 4, 4, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x191919, 0x0, 0xCECECE, 4, 4, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x191919, 0x0, 0xCECECE, 4, 4, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 10, 9);

super.setImageFond("C:\\WINDEV Mobile 21 Express\\Exemples\\Android\\Android Système\\images\\boutton_4etats_transparent.png?E4_3NP_9_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Actualiser
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// sablier(Vrai)
WDAPIDivers.sablier(true);

// Actualise()
fWD_actualise();

// Sablier(Faux)
WDAPIDivers.sablier(false);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Actualiser mWD_BTN_Actualiser;

/**
 * IMG_P1
 */
class GWDIMG_P1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de EXPRESS_Wifi.IMG_P1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2938226589756208363l);

super.setChecksum("1087205551");

super.setNom("IMG_P1");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(-52, -203);

super.setTailleInitiale(38, 38);

super.setValeurInitiale("C:\\WINDEV Mobile 21 Express\\Exemples\\Android\\Android Système\\stat_sys_wifi_signal_1.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(1, 0, true, 2500);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xDDDDDD, 0x5D5D5D, 0xFFFFFFFF, 4, 4, 0, 1));


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_P1 mWD_IMG_P1;

/**
 * IMG_P2
 */
class GWDIMG_P2 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de EXPRESS_Wifi.IMG_P2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2938226589756273899l);

super.setChecksum("1087271087");

super.setNom("IMG_P2");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(-52, -162);

super.setTailleInitiale(38, 38);

super.setValeurInitiale("C:\\WINDEV Mobile 21 Express\\Exemples\\Android\\Android Système\\stat_sys_wifi_signal_2.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(1, 0, true, 2500);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xDDDDDD, 0x5D5D5D, 0xFFFFFFFF, 4, 4, 0, 1));


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_P2 mWD_IMG_P2;

/**
 * IMG_P3
 */
class GWDIMG_P3 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de EXPRESS_Wifi.IMG_P3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2938226589756339435l);

super.setChecksum("1087336623");

super.setNom("IMG_P3");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(-52, -121);

super.setTailleInitiale(38, 38);

super.setValeurInitiale("C:\\WINDEV Mobile 21 Express\\Exemples\\Android\\Android Système\\stat_sys_wifi_signal_3.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(1, 0, true, 2500);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xDDDDDD, 0x5D5D5D, 0xFFFFFFFF, 4, 4, 0, 1));


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_P3 mWD_IMG_P3;

/**
 * IMG_P4
 */
class GWDIMG_P4 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de EXPRESS_Wifi.IMG_P4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2938226589756404971l);

super.setChecksum("1087402159");

super.setNom("IMG_P4");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(-52, -80);

super.setTailleInitiale(38, 38);

super.setValeurInitiale("C:\\WINDEV Mobile 21 Express\\Exemples\\Android\\Android Système\\stat_sys_wifi_signal_4.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(1, 0, true, 2500);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xDDDDDD, 0x5D5D5D, 0xFFFFFFFF, 4, 4, 0, 1));


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_P4 mWD_IMG_P4;

/**
 * IMG_On
 */
class GWDIMG_On extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de EXPRESS_Wifi.IMG_On
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2938226589756470507l);

super.setChecksum("1087467695");

super.setNom("IMG_On");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(0, -203);

super.setTailleInitiale(11, 63);

super.setValeurInitiale("C:\\WINDEV Mobile 21 Express\\Exemples\\Android\\Android Système\\button_onoff_indicator_on.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(1, 0, true, 2500);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xDDDDDD, 0x5D5D5D, 0xFFFFFFFF, 4, 4, 0, 1));


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_On mWD_IMG_On;

/**
 * IMG_Off
 */
class GWDIMG_Off extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de EXPRESS_Wifi.IMG_Off
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2938226589756536043l);

super.setChecksum("1087533231");

super.setNom("IMG_Off");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(0, -128);

super.setTailleInitiale(11, 63);

super.setValeurInitiale("C:\\WINDEV Mobile 21 Express\\Exemples\\Android\\Android Système\\button_onoff_indicator_off.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(1, 0, true, 2500);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xDDDDDD, 0x5D5D5D, 0xFFFFFFFF, 4, 4, 0, 1));


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_Off mWD_IMG_Off;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de EXPRESS_Wifi.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2938226589756667115l);

super.setChecksum("1087662023");

super.setNom("#EXPRESSVersion");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Version Express");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(96, 96);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(10);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_Wifi.#EXPRESSVersion

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWD_EXPRESSVersion mWD__EXPRESSVersion;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de EXPRESS_Wifi
////////////////////////////////////////////////////////////////////////////
//  Résumé : Affiche les réseaux WIFI disponibles dans la zone répétée
//  Syntaxe :
//  AfficheRéseauxWifi ()
// 
// 
public void fWD_afficheReseauxWifi()
{
initExecProcLocale("AfficheRéseauxWifi");


try
{
// ZoneRépétéeSupprimeTout(ZR_RéseauWifiDispo)
WDAPIZoneRepetee.zoneRepeteeSupprimeTout(mWD_ZR_ReseauWifiDispo);

// SI WiFiEtat() = wifiActif ALORS
if(WDAPIWiFi.wifiEtat().opEgal(1))
{
// 	sListe est une chaîne = WiFiDétectePointAccès()
WDObjet vWD_sListe = new WDChaineU();


vWD_sListe.setValeur(WDAPIWiFi.wifiDetectePointAcces());


// 	POUR TOUTE CHAINE sPointAcces DE sListe SEPAREE PAR RC
IWDParcours parcours1 = null;
try
{
WDObjet vWD_sPointAcces = new WDChaineU();
parcours1 = WDParcoursSousChaine.pourTout(vWD_sPointAcces, null, null, vWD_sListe, "\r\n", 0x2);
while(parcours1.testParcours())
{
// 		sIdentifiant est une chaîne = ExtraitChaîne(sPointAcces,1, TAB)
WDObjet vWD_sIdentifiant = new WDChaineU();


vWD_sIdentifiant.setValeur(WDAPIChaine.extraitChaine(parcours1.getVariableParcours(),1,new WDChaineU("\t")));


// 		sSSID est une chaîne = ExtraitChaîne(sPointAcces,2, TAB)
WDObjet vWD_sSSID = new WDChaineU();


vWD_sSSID.setValeur(WDAPIChaine.extraitChaine(parcours1.getVariableParcours(),2,new WDChaineU("\t")));


// 		sBSSID est une chaîne = ExtraitChaîne(sPointAcces,3, TAB)
WDObjet vWD_sBSSID = new WDChaineU();


vWD_sBSSID.setValeur(WDAPIChaine.extraitChaine(parcours1.getVariableParcours(),3,new WDChaineU("\t")));


// 		sSécurité est une chaîne = ExtraitChaîne(sPointAcces,4, TAB)
WDObjet vWD_sSecurite = new WDChaineU();


vWD_sSecurite.setValeur(WDAPIChaine.extraitChaine(parcours1.getVariableParcours(),4,new WDChaineU("\t")));


// 		sPuissance est une chaîne = ExtraitChaîne(sPointAcces,5, TAB)
WDObjet vWD_sPuissance = new WDChaineU();


vWD_sPuissance.setValeur(WDAPIChaine.extraitChaine(parcours1.getVariableParcours(),5,new WDChaineU("\t")));


// 		sConnecté est une chaine = ""
WDObjet vWD_sConnecte = new WDChaineU();


vWD_sConnecte.setValeur("");


// 		SI sSécurité = wifiSecuritéAucune ALORS
if(vWD_sSecurite.opEgal("NONE"))
{
// 			sSécurité = "Non sécurisé"
vWD_sSecurite.setValeur("Non sécurisé");

}

// 		SI gsIDEncours = sIdentifiant et gsIDEncours <> "" ALORS
if((vWD_gsIDEncours.opEgal(vWD_sIdentifiant) & vWD_gsIDEncours.opDiff("")))
{
// 			sConnecté = "Connecté"
vWD_sConnecte.setValeur("Connecté");

}

// 		ZoneRépétéeAjoute(ZR_RéseauWifiDispo,sSSID + TAB + sSécurité + TAB + sPuissance + TAB + sIdentifiant + TAB + sBSSID + TAB + sConnecté)
WDAPIZoneRepetee.zoneRepeteeAjoute(mWD_ZR_ReseauWifiDispo,vWD_sSSID.opPlus("\t").opPlus(vWD_sSecurite).opPlus("\t").opPlus(vWD_sPuissance).opPlus("\t").opPlus(vWD_sIdentifiant).opPlus("\t").opPlus(vWD_sBSSID).opPlus("\t").opPlus(vWD_sConnecte).getString());

}

}
finally
{
if(parcours1 != null)
{
parcours1.finParcours();
}
}


// 	ZR_RéseauWifiDispo..Visible = Vrai
mWD_ZR_ReseauWifiDispo.setVisible(true);

}
else
{
// 	ZR_RéseauWifiDispo..Visible = Faux
mWD_ZR_ReseauWifiDispo.setVisible(false);

}

}
finally
{
finExecProcLocale();
}

}



//  Résumé : Actualise la fenêtre
public void fWD_actualise()
{
initExecProcLocale("Actualise");


try
{
// SI WiFiEtat() = wifiDésactivé ALORS
if(WDAPIWiFi.wifiEtat().opEgal(4))
{
// 	BTN_Activer = "Activer le Wifi"
mWD_BTN_Activer.setValeur("Activer le Wifi");

// 	BTN_Actualiser..Etat = Grisé
mWD_BTN_Actualiser.setEtat(4);

}
else
{
// 	BTN_Activer = "Désactiver le Wifi"
mWD_BTN_Activer.setValeur("Désactiver le Wifi");

// 	BTN_Actualiser..Etat = Actif
mWD_BTN_Actualiser.setEtat(0);

// 	gsIDEncours = WiFiInfoConnexion(wifiIdReseau)
vWD_gsIDEncours.setValeur(WDAPIWiFi.wifiInfoConnexion(32));

}

// AfficheRéseauxWifi()
fWD_afficheReseauxWifi();

}
finally
{
finExecProcLocale();
}

}




/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_Wifi.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("");

super.setParamBoutonGauche(true, 0, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xFF000001, 0xFF000001, true);

super.setImageFond("");

super.terminerInitialisation();
}

/**
 * Traitement: Clic sur le bouton de gauche de ACTB_ActionBar
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(EXPRESS_Accueil)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_bennetout.ms_Project.mWD_EXPRESS_Accueil);

}




////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDACTB_ActionBar mWD_ACTB_ActionBar;

/**
 * EXPRESS_Wifi_LeftSliding
 */
class GWDEXPRESS_Wifi_LeftSliding extends WDSlidingMenu
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de EXPRESS_Wifi.EXPRESS_Wifi_LeftSliding
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setFenetreInterne("EXPRESS_FI_SlidingMenu");

super.setParamSlidingMenu(0, true, 0);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDEXPRESS_Wifi_LeftSliding mWD_EXPRESS_Wifi_LeftSliding;

/**
 * Traitement: Déclarations globales de EXPRESS_Wifi
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{



// gsIDEncours est une chaine
vWD_gsIDEncours = new WDChaineU();

super.ajouterVariableGlobale("gsIDEncours",vWD_gsIDEncours);



}






/**
 * Traitement: Fermeture de EXPRESS_Wifi
 */
public void fermetureFenetre()
{
super.fermetureFenetre();


try
{
}
finally
{
// Générer les appels aux ancêtres
}

}












// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_gsIDEncours = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre EXPRESS_Wifi
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_BTN_Activer = new GWDBTN_Activer();
mWD_ZR_ReseauWifiDispo = new GWDZR_ReseauWifiDispo();
mWD_BTN_Actualiser = new GWDBTN_Actualiser();
mWD_IMG_P1 = new GWDIMG_P1();
mWD_IMG_P2 = new GWDIMG_P2();
mWD_IMG_P3 = new GWDIMG_P3();
mWD_IMG_P4 = new GWDIMG_P4();
mWD_IMG_On = new GWDIMG_On();
mWD_IMG_Off = new GWDIMG_Off();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();
mWD_EXPRESS_Wifi_LeftSliding = new GWDEXPRESS_Wifi_LeftSliding();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre EXPRESS_Wifi
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2938226589755159787l);

super.setChecksum("1091073336");

super.setNom("EXPRESS_Wifi");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(460, 320);

super.setTitre("WIFI");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 4, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_Wifi
////////////////////////////////////////////////////////////////////////////
mWD_BTN_Activer.initialiserObjet();
super.ajouter("BTN_Activer", mWD_BTN_Activer);
mWD_ZR_ReseauWifiDispo.initialiserObjet();
super.ajouter("ZR_RéseauWifiDispo", mWD_ZR_ReseauWifiDispo);
mWD_BTN_Actualiser.initialiserObjet();
super.ajouter("BTN_Actualiser", mWD_BTN_Actualiser);
mWD_IMG_P1.initialiserObjet();
super.ajouter("IMG_P1", mWD_IMG_P1);
mWD_IMG_P2.initialiserObjet();
super.ajouter("IMG_P2", mWD_IMG_P2);
mWD_IMG_P3.initialiserObjet();
super.ajouter("IMG_P3", mWD_IMG_P3);
mWD_IMG_P4.initialiserObjet();
super.ajouter("IMG_P4", mWD_IMG_P4);
mWD_IMG_On.initialiserObjet();
super.ajouter("IMG_On", mWD_IMG_On);
mWD_IMG_Off.initialiserObjet();
super.ajouter("IMG_Off", mWD_IMG_Off);
mWD__EXPRESSVersion.initialiserObjet();
super.ajouter("#EXPRESSVersion", mWD__EXPRESSVersion);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);
mWD_EXPRESS_Wifi_LeftSliding.initialiserObjet();
super.ajouterSlidingMenu(mWD_EXPRESS_Wifi_LeftSliding, 0);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return true;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return false;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isThemeDark()
{
return false;
}
/**
* Retourne vrai si l'option de masquage automatique de l'ActionBar lorsqu'on scrolle dans un champ de la fenêtre a été activée.
*/
public boolean isMasquageAutomatiqueActionBar()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPEXPRESS_bennetout.ms_Project.mWD_EXPRESS_Wifi;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "170 ActivAndroid 4-HoloLight";
}
}
