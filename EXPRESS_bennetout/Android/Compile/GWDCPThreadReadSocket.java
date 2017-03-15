/**
 * Code généré par WinDev Mobile Express - NE PAS MODIFIER !
 * Objet WinDev Mobile Express : Collection
 * Classe Android : ThreadReadSocket
 * Date : 15/03/2017 17:54:53
 * Version de wdjava.dll  : 21.0.118.0
 */


package com.masociete.express_bennetout.wdgen;


import com.masociete.express_bennetout.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.api.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



class GWDCPThreadReadSocket extends WDCollProcAndroid
{

// Code de terminaison de ThreadReadSocket
static public void term()
{
// SI SocketConnecte("socket", 65000, "192.168.42.1") = Faux ALORS
if(WDAPISocket.socketConnecte(new WDChaineA("socket").getString(),65000,new WDChaineA("192.168.42.1").getString()).opEgal(false))
{
// 	Erreur("erreur de connexion " + ErreurInfo(errMessage))
WDAPIDialogue.erreur(new WDChaineA("erreur de connexion ").opPlus(WDAPIVM.erreurInfo(1)).getString());

}
else
{
// 	SocketChangeModeTransmission("socket", SocketMarqueurFin, CRLF)
WDAPISocket.socketChangeModeTransmission(new WDChaineA("socket").getString(),0,new WDChaineA("\r\n").getString());

}

}



// Nombre de Procédures : 0

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
