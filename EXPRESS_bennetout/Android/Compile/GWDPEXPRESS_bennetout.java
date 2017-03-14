/**
 * Code généré par WinDev Mobile Express - NE PAS MODIFIER !
 * Objet WinDev Mobile Express : Projet
 * Classe Android : EXPRESS_bennetout
 * Date : 14/03/2017 14:01:57
 * Version de wdjava.dll  : 21.0.118.0
 */


package com.masociete.express_bennetout.wdgen;


import com.masociete.express_bennetout.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.api.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPEXPRESS_bennetout extends WDProjet
{
/**
 * Accès au projet: EXPRESS_bennetout
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPEXPRESS_bennetout.ms_Project
 */
public static GWDPEXPRESS_bennetout ms_Project;

 // EXPRESS_Accueil
public GWDFEXPRESS_Accueil mWD_EXPRESS_Accueil = new GWDFEXPRESS_Accueil();
 // accesseur de EXPRESS_Accueil
public GWDFEXPRESS_Accueil getEXPRESS_Accueil()
{
mWD_EXPRESS_Accueil.verifierOuverte();
return mWD_EXPRESS_Accueil;
}

 // EXPRESS_Wifi
public GWDFEXPRESS_Wifi mWD_EXPRESS_Wifi = new GWDFEXPRESS_Wifi();
 // accesseur de EXPRESS_Wifi
public GWDFEXPRESS_Wifi getEXPRESS_Wifi()
{
mWD_EXPRESS_Wifi.verifierOuverte();
return mWD_EXPRESS_Wifi;
}


 // EXPRESS_FI_SlidingMenu
public GWDFIEXPRESS_FI_SlidingMenu mWD_EXPRESS_FI_SlidingMenu = new GWDFIEXPRESS_FI_SlidingMenu();
 // accesseur de EXPRESS_FI_SlidingMenu
public GWDFIEXPRESS_FI_SlidingMenu getEXPRESS_FI_SlidingMenu()
{
GWDFIEXPRESS_FI_SlidingMenu fiCtx = (GWDFIEXPRESS_FI_SlidingMenu)WDAppelContexte.getContexte().getFenetreInterne("EXPRESS_FI_SlidingMenu");
return fiCtx != null ? fiCtx  : mWD_EXPRESS_FI_SlidingMenu;
}

 // Constructeur de la classe GWDPEXPRESS_bennetout
public GWDPEXPRESS_bennetout()
{
ajouterFenetre("EXPRESS_Accueil", mWD_EXPRESS_Accueil);
ajouterFenetre("EXPRESS_Wifi", mWD_EXPRESS_Wifi);
ajouterFenetreInterne("EXPRESS_FI_SlidingMenu");

}


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
static
{
// Allocation de l'objet global
GWDPEXPRESS_bennetout.ms_Project = new GWDPEXPRESS_bennetout();

// Définition des langues du projet
GWDPEXPRESS_bennetout.ms_Project.setLangueProjet(new int[] {1}, new int[] {0}, 1, false);
GWDPEXPRESS_bennetout.ms_Project.setNomCollectionProcedure(new String[]{});
}
public String getVersionApplication(){ return "0.0.2.0";}
public String getNomSociete(){ return "PC SOFT";}
public String getNomAPK(){ return "EXPRESS_bennetout";}
public int getIdNomApplication(){return com.masociete.express_bennetout.R.string.app_name;}
public boolean isModeAnsi(){ return false;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "com.masociete.express_bennetout";}
public int getIdIconeApplication(){ return com.masociete.express_bennetout.R.drawable.i_c_o_n_e________0;}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 216;
case HAUTEUR_BARRE_SYSTEME : return 25;
case HAUTEUR_BARRE_TITRE : return 25;
case HAUTEUR_ACTION_BAR : return 56;
case HAUTEUR_BARRE_BAS : return 56;
case HAUTEUR_ECRAN : return 948;
case LARGEUR_ECRAN : return 593;
default : return 0;
}
}
public boolean isActiveThemeMaterialDesign()
{
return true;
}
public boolean isIgnoreErreurCertificatHTTPS()
{
return false;
}
////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
protected void declarerRessources()
{
super.ajouterFichierAssocie("C:\\WINDEV MOBILE 21 EXPRESS\\EXEMPLES\\ANDROID\\ANDROID SYSTÈME\\STAT_SYS_WIFI_SIGNAL_2.PNG",com.masociete.express_bennetout.R.drawable.stat_sys_wifi_signal_2_14+23, "");
super.ajouterFichierAssocie("C:\\WINDEV MOBILE 21 EXPRESS\\EXEMPLES\\ANDROID\\ANDROID SYSTÈME\\STAT_SYS_WIFI_SIGNAL_1.PNG",com.masociete.express_bennetout.R.drawable.stat_sys_wifi_signal_1_13+23, "");
super.ajouterFichierAssocie("C:\\WINDEV MOBILE 21 EXPRESS\\EXEMPLES\\ANDROID\\ANDROID SYSTÈME\\STAT_SYS_WIFI_SIGNAL_0.PNG",com.masociete.express_bennetout.R.drawable.stat_sys_wifi_signal_0_12+23, "");
super.ajouterFichierAssocie("C:\\WINDEV MOBILE 21 EXPRESS\\EXEMPLES\\ANDROID\\ANDROID SYSTÈME\\IMAGES\\BOUTTON_4ETATS_TRANSPARENT.PNG?E4_3NP_9_10_10_10",com.masociete.express_bennetout.R.drawable.boutton_4etats_transparent_11_np3_9_10_10_10_selector+23, "");
super.ajouterFichierAssocie("C:\\WINDEV MOBILE 21 EXPRESS\\EXEMPLES\\ANDROID\\ANDROID SYSTÈME\\IC_MENU_REFRESH.PNG",com.masociete.express_bennetout.R.drawable.ic_menu_refresh_10+23, "");
super.ajouterFichierAssocie("C:\\WINDEV MOBILE 21 EXPRESS\\EXEMPLES\\ANDROID\\ANDROID SYSTÈME\\GABARITS\\WM\\170 ACTIVANDROID 4-HOLOLIGHT\\ACTIVANDROID 4-HOLOLIGHT_SELECT.PNG?E5_3NP_4_4_4_4",com.masociete.express_bennetout.R.drawable.activandroid_4_hololight_select_9_np3_4_4_4_4_selector+23, "");
super.ajouterFichierAssocie("C:\\WINDEV MOBILE 21 EXPRESS\\EXEMPLES\\ANDROID\\ANDROID SYSTÈME\\GABARITS\\WM\\170 ACTIVANDROID 4-HOLOLIGHT\\ACTIVANDROID 4-HOLOLIGHT_ROLLOVER.PNG",com.masociete.express_bennetout.R.drawable.activandroid_4_hololight_rollover_8+23, "");
super.ajouterFichierAssocie("C:\\WINDEV MOBILE 21 EXPRESS\\EXEMPLES\\ANDROID\\ANDROID SYSTÈME\\GABARITS\\WM\\170 ACTIVANDROID 4-HOLOLIGHT\\ACTIVANDROID 4-HOLOLIGHT_BREAK.PNG",com.masociete.express_bennetout.R.drawable.activandroid_4_hololight_break_7+23, "");
super.ajouterFichierAssocie("C:\\WINDEV MOBILE 21 EXPRESS\\EXEMPLES\\ANDROID\\ANDROID SYSTÈME\\BUTTON_ONOFF_INDICATOR_ON.PNG",com.masociete.express_bennetout.R.drawable.button_onoff_indicator_on_6+23, "");
super.ajouterFichierAssocie("C:\\WINDEV MOBILE 21 EXPRESS\\EXEMPLES\\ANDROID\\ANDROID SYSTÈME\\BUTTON_ONOFF_INDICATOR_OFF.PNG",com.masociete.express_bennetout.R.drawable.button_onoff_indicator_off_5+23, "");
super.ajouterFichierAssocie("D:\\MES DOCUMENTS\\WORKSPACE\\BENNETOUT-APP\\EXPRESS_BENNETOUT\\PICTO-NOTGOOD.PNG",com.masociete.express_bennetout.R.drawable.picto_notgood_4+23, "");
super.ajouterFichierAssocie("D:\\MES DOCUMENTS\\WORKSPACE\\BENNETOUT-APP\\EXPRESS_BENNETOUT\\PICTO-GOOD.PNG",com.masociete.express_bennetout.R.drawable.picto_good_3+23, "");
super.ajouterFichierAssocie("D:\\MES DOCUMENTS\\WORKSPACE\\BENNETOUT-APP\\EXPRESS_BENNETOUT\\BOUTTON_4ETATS_TRANSPARENT.PNG?E4_3NP_9_10_10_10",com.masociete.express_bennetout.R.drawable.boutton_4etats_transparent_2_np3_9_10_10_10_selector+23, "");
super.ajouterFichierAssocie("D:\\Mes Documents\\Workspace\\bennetout-app\\EXPRESS_bennetout\\IOS_ZR_ARROW.PNG",com.masociete.express_bennetout.R.drawable.ios_zr_arrow_1+23, "");
super.ajouterFichierAssocie("C:\\WINDEV MOBILE 21 EXPRESS\\EXEMPLES\\ANDROID\\ANDROID SYSTÈME\\STAT_SYS_WIFI_SIGNAL_3.PNG",com.masociete.express_bennetout.R.drawable.stat_sys_wifi_signal_3_15+23, "");
super.ajouterFichierAssocie("C:\\WINDEV MOBILE 21 EXPRESS\\EXEMPLES\\ANDROID\\ANDROID SYSTÈME\\STAT_SYS_WIFI_SIGNAL_4.PNG",com.masociete.express_bennetout.R.drawable.stat_sys_wifi_signal_4_16+23, "");
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////
// Dialogues avec Question
////////////////////////////////////////////////////////////////////////////
public WDObjet afficherDialogue(int nIdQuestion, String... params)
{
switch(nIdQuestion)
{
case 0 : return WDAPIDialogue.dialogue("Voulez-vous vous connecter à ce réseau WIFI %1 ?", new String[] {"Se connecter", "&Ne pas connecter"} , new int[] {1, 2} , 0, 1, 1, "", 1, params);
case 1 : return WDAPIDialogue.dialogue("Voulez-vous vous déconnecter?", new String[] {"Se connecter", "&Ne pas connecter"} , new int[] {1, 2} , 0, 1, 1, "", 1, params);

default: return super.afficherDialogue(nIdQuestion, params);
}
}

////////////////////////////////////////////////////////////////////////////
// Saisies avec Question
////////////////////////////////////////////////////////////////////////////
public WDObjet afficherSaisie(int nIdQuestion, WDObjet variable, String... params)
{
switch(nIdQuestion)
{
case 0 : return WDAPIDialogue.saisie("Voulez-vous vous connecter à ce réseau WIFI %1 ?", new String[] {"Se connecter", "&Ne pas connecter"} , new int[] {1, 2} , 0, 1, 1, "", 1, variable, params);
case 1 : return WDAPIDialogue.saisie("Voulez-vous vous déconnecter?", new String[] {"Se connecter", "&Ne pas connecter"} , new int[] {1, 2} , 0, 1, 1, "", 1, variable, params);

default: return super.afficherSaisie(nIdQuestion, variable, params);
}
}


/**
 * Appel des méthodes d'initialisation des classes / collections de procédures / projet
 */
static void GWDPEXPRESS_bennetout_InitProjet( String [] args)
{
GWDPEXPRESS_bennetout.ms_Project.initialiserProjet("EXPRESS_bennetout", "Application Android", args);
}

/**
 * Appel des méthodes de terminaison des projet / collections de procédures / classes
 */
static protected void GWDPEXPRESS_bennetout_TermineProjet()
{

// Terminaison des collections de procédures et des classes

// Libération de l'objet global
GWDPEXPRESS_bennetout.ms_Project = null;
}

/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public void init()
{
// Appel des méthodes d'initialisation
GWDPEXPRESS_bennetout_InitProjet(null);
}
public void run()
{

GWDPEXPRESS_bennetout.ms_Project.lancerProjet();
}
}
}
