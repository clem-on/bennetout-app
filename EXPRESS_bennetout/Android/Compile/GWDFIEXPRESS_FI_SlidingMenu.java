/**
 * Code généré par WinDev Mobile Express - NE PAS MODIFIER !
 * Objet WinDev Mobile Express : Fenêtre
 * Classe Android : EXPRESS_FI_SlidingMenu
 * Date : 15/03/2017 17:33:48
 * Version de wdjava.dll  : 21.0.118.0
 */


package com.masociete.express_bennetout.wdgen;


import com.masociete.express_bennetout.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.*;
import fr.pcsoft.wdjava.ui.champs.zml.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.api.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFIEXPRESS_FI_SlidingMenu extends WDFenetreInterne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de EXPRESS_FI_SlidingMenu
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_Menu
 */
class GWDZM_Menu extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FI_SlidingMenu.EXPRESS_FI_SlidingMenu.ZM_Menu
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_Menu_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FI_SlidingMenu.EXPRESS_FI_SlidingMenu.ZM_Menu
////////////////////////////////////////////////////////////////////////////

/**
 * Libellé1
 */
class GWDLibelle1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FI_SlidingMenu.EXPRESS_FI_SlidingMenu.ZM_Menu.Libellé1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetreInterne( getWDFenetreInterneThis() );
super.setQuid(2938210247179216572l);

super.setChecksum("860768955");

super.setNom("Libellé1");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("WiFi");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(12, 4);

super.setTailleInitiale(22, 171);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(32768);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Droid Sans", -8.000000, 0), 3);

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
public GWDLibelle1 mWD_Libelle1 = new GWDLibelle1();

/**
 * Puce
 */
class GWDPuce extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FI_SlidingMenu.EXPRESS_FI_SlidingMenu.ZM_Menu.Puce
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetreInterne( getWDFenetreInterneThis() );
super.setQuid(2938210247179478716l);

super.setChecksum("861033379");

super.setNom("Puce");

super.setType(8);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(0, 210);

super.setTailleInitiale(47, 10);

super.setValeurInitiale("D:\\Mes Documents\\Workspace\\bennetout-app\\EXPRESS_bennetout\\iOS_ZR_Arrow.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(6, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(2097162, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

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
public GWDPuce mWD_Puce = new GWDPuce();
class GWDZM_Menu_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de EXPRESS_FI_SlidingMenu.EXPRESS_FI_SlidingMenu.ZM_Menu
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FI_SlidingMenu.EXPRESS_FI_SlidingMenu.ZM_Menu
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_Libelle1.initialiserObjet();
super.ajouterChamp(mWD_Libelle1);
mWD_Puce.initialiserObjet();
super.ajouterChamp(mWD_Puce);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(48);

super.setVisibleInitial(true);

super.setModeSelection(-1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_Menu_Ligne1 mWD_ZM_Menu_Ligne1 = new GWDZM_Menu_Ligne1();
/**
 * Initialise tous les champs de EXPRESS_FI_SlidingMenu.EXPRESS_FI_SlidingMenu.ZM_Menu
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FI_SlidingMenu.EXPRESS_FI_SlidingMenu.ZM_Menu
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_Menu_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_Menu_Ligne1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetreInterne( getWDFenetreInterneThis() );
super.setPresenceLibelle(false);

super.setQuid(2938208361678893568l);

super.setChecksum("851131320");

super.setNom("ZM_Menu");

super.setType(97);

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(48, 231);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(1);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x0, creerPolice_GEN("Droid Sans", -9.000000, 0), -1);

super.setCouleurSeparateur(0xE0E0E0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFF, 0x7F7F7F, 0xFFFFFFFF, 4, 4, 1, 1));

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFF, 9, 9, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xF5000000, 4, 4, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_Menu
 */
public void selectionLigne()
//  Ouverture de la fenêtre désiré
{
super.selectionLigne();

// SELON ZM_Menu
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
WDObjet _WDExpSelon0 = this;
if(_WDExpSelon0.opEgal(1))
{
// 		OuvreFenêtreMobile(EXPRESS_Wifi)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_bennetout.ms_Project.mWD_EXPRESS_Wifi);

}
else {
}

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_Menu mWD_ZM_Menu;

/**
 * Traitement: Déclarations globales de EXPRESS_FI_SlidingMenu
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre EXPRESS_FI_SlidingMenu
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ZM_Menu = new GWDZM_Menu();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre EXPRESS_FI_SlidingMenu
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setQuid(2938208284368744125l);

super.setChecksum("850363547");

super.setNom("EXPRESS_FI_SlidingMenu");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTailleInitiale(948, 231);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setCouleurFond(0xFFFFFF);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FI_SlidingMenu
////////////////////////////////////////////////////////////////////////////
mWD_ZM_Menu.initialiserObjet();
super.ajouter("ZM_Menu", mWD_ZM_Menu);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
}
