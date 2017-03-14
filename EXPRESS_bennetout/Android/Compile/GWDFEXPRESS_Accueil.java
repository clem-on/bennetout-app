/**
 * Code généré par WinDev Mobile Express - NE PAS MODIFIER !
 * Objet WinDev Mobile Express : Fenêtre
 * Classe Android : EXPRESS_Accueil
 * Date : 14/03/2017 14:01:57
 * Version de wdjava.dll  : 21.0.118.0
 */


package com.masociete.express_bennetout.wdgen;


import com.masociete.express_bennetout.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.champs.slidingmenu.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFEXPRESS_Accueil extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de EXPRESS_Accueil
////////////////////////////////////////////////////////////////////////////

/**
 * Affichage_inclinoX
 */
class GWDAffichage_inclinoX extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_Accueil.Affichage_inclinoX
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2938569156029300102l);

super.setChecksum("768845810");

super.setNom("Affichage_inclinoX");

super.setType(3);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("MoneySystemMask"));

super.setLibelle("");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(33, 32);

super.setTailleInitiale(30, 157);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -11.000000, 1), 3);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 4, 4, 1, 1));

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
public GWDAffichage_inclinoX mWD_Affichage_inclinoX;

/**
 * BTN_inclinoX
 */
class GWDBTN_inclinoX extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_Accueil.BTN_inclinoX
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2938569499632006412l);

super.setChecksum("774168976");

super.setNom("BTN_inclinoX");

super.setType(4);

super.setLibelle("Test");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(24, 322);

super.setTailleInitiale(48, 210);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(4);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

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

super.setImageFond("D:\\Mes Documents\\Workspace\\bennetout-app\\EXPRESS_bennetout\\boutton_4etats_transparent.png?E4_3NP_9_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_inclinoX
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// InclinoX ++
vWD_InclinoX.opInc();

// Affichage_inclinoX = NumériqueVersChaîne(InclinoX)
mWD_Affichage_inclinoX.setValeur(WDAPINum.numeriqueVersChaine(vWD_InclinoX));

// SI Fond = good ALORS
if(mWD_Fond.opEgal(mWD_good))
{
// 	Fond = not_good
mWD_Fond.setValeur(mWD_not_good);

}
else
{
// 	Fond = good
mWD_Fond.setValeur(mWD_good);

}

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
public GWDBTN_inclinoX mWD_BTN_inclinoX;

/**
 * Fond
 */
class GWDFond extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_Accueil.Fond
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2938573257734640036l);

super.setChecksum("780421299");

super.setNom("Fond");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(104, 56);

super.setTailleInitiale(313, 483);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(6, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 4, 4, 0, 1));


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
public GWDFond mWD_Fond;

/**
 * good
 */
class GWDgood extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de EXPRESS_Accueil.good
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2938573803197251997l);

super.setChecksum("782186795");

super.setNom("good");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(-67, -273);

super.setTailleInitiale(200, 184);

super.setValeurInitiale("D:\\Mes Documents\\Workspace\\bennetout-app\\EXPRESS_bennetout\\picto-good.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(6, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 4, 4, 0, 1));


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
public GWDgood mWD_good;

/**
 * not_good
 */
class GWDnot_good extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de EXPRESS_Accueil.not_good
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2938573871917464942l);

super.setChecksum("782923020");

super.setNom("not_good");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(154, -276);

super.setTailleInitiale(200, 184);

super.setValeurInitiale("D:\\Mes Documents\\Workspace\\bennetout-app\\EXPRESS_bennetout\\picto-notgood.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(6, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 4, 4, 0, 1));


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
public GWDnot_good mWD_not_good;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de EXPRESS_Accueil.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2938207391006621628l);

super.setChecksum("841425186");

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

super.setAltitude(6);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_Accueil.#EXPRESSVersion

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWD_EXPRESSVersion mWD__EXPRESSVersion;

/**
 * Accueil
 */
class GWDAccueil extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_Accueil.Accueil
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("Accueil");

super.setNote("");

super.setParamBoutonGauche(true, 3, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xFF000001, 0xFF000001, true);

super.setImageFond("");

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDAccueil mWD_Accueil;

/**
 * EXPRESS_Accueil_LeftSliding
 */
class GWDEXPRESS_Accueil_LeftSliding extends WDSlidingMenu
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de EXPRESS_Accueil.EXPRESS_Accueil_LeftSliding
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
public GWDEXPRESS_Accueil_LeftSliding mWD_EXPRESS_Accueil_LeftSliding;

/**
 * Traitement: Déclarations globales de EXPRESS_Accueil
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


// InclinoX est un réel = 0
vWD_InclinoX = new WDReel();

vWD_InclinoX.setValeur(0);

super.ajouterVariableGlobale("InclinoX",vWD_InclinoX);



}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_InclinoX = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre EXPRESS_Accueil
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_Affichage_inclinoX = new GWDAffichage_inclinoX();
mWD_BTN_inclinoX = new GWDBTN_inclinoX();
mWD_Fond = new GWDFond();
mWD_good = new GWDgood();
mWD_not_good = new GWDnot_good();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();
mWD_Accueil = new GWDAccueil();
mWD_EXPRESS_Accueil_LeftSliding = new GWDEXPRESS_Accueil_LeftSliding();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre EXPRESS_Accueil
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2938207391006556092l);

super.setChecksum("846511291");

super.setNom("EXPRESS_Accueil");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(456, 593);

super.setTitre("Accueil");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_Accueil
////////////////////////////////////////////////////////////////////////////
mWD_Affichage_inclinoX.initialiserObjet();
super.ajouter("Affichage_inclinoX", mWD_Affichage_inclinoX);
mWD_BTN_inclinoX.initialiserObjet();
super.ajouter("BTN_inclinoX", mWD_BTN_inclinoX);
mWD_Fond.initialiserObjet();
super.ajouter("Fond", mWD_Fond);
mWD_good.initialiserObjet();
super.ajouter("good", mWD_good);
mWD_not_good.initialiserObjet();
super.ajouter("not_good", mWD_not_good);
mWD__EXPRESSVersion.initialiserObjet();
super.ajouter("#EXPRESSVersion", mWD__EXPRESSVersion);
mWD_Accueil.initialiserObjet();
super.ajouterActionBar(mWD_Accueil);
mWD_EXPRESS_Accueil_LeftSliding.initialiserObjet();
super.ajouterSlidingMenu(mWD_EXPRESS_Accueil_LeftSliding, 0);

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
return true;
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
return GWDPEXPRESS_bennetout.ms_Project.mWD_EXPRESS_Accueil;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "210 Material Design Red";
}
}
