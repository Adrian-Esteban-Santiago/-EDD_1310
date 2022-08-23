#include <iostream>
#include <fstream>
#include <string>
#include <algorithm>
#include <vector>
#include <sstream>




        int anio;
        float enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre;
        int redesSoc, concep;

int main(){
    
//using namespace std;

    fstream file ("presenciaredes.csv", ios::in);
    if(file.is_open()) {
        getline(file, line);
        while(getline(file, line)) {
          //  row.clear();
            stringstream str(line);
            content.push_back(row);
        }

        file.close();
    } else {
        cout<<"Could not open the file\n";
    }
//Mostrar en pantalla la diferencia de seguidores(followers) en twitter entre el mes de enero y junio.
    for(int i = 0; i < content.size(); i++) {
        if(content[i].redesSoc == "TWITTER" && content[i].concep.find("SEGUIDORES") != std::string::npos) {
            cout << "Diferencia de seguidores (enero - junio) : " << (content[i].junio - content[i].enero) << '\n';
        }
    }

    cout << '\n';

    int pmes, smes;
    cout << "Meses para la calculación de visualizaciones:" << '\n';
    cout << "  1 - enero" << '\n';
    cout << "  2 - febrero" << '\n';
    cout << "  3 - marzo" << '\n';
    cout << "  4 - abril" << '\n';
    cout << "  5 - mayo" << '\n';
    cout << "  6 - junio" << '\n';

    cout << "Introduzca los meses a comparar:" << '\n';
    cout << "mes 1: ";
    cin >> pmes;
    cout << "mes 2: ";
    cin >> smes;

    if (pmes > smes) {
        cout << "El mes 1 no puede ser mayor que el mes 2" << '\n';
    } else {
        for(int i = 0; i < content.size(); i++) {
            if(content[i].redesSoc == "YOUTUBE" && content[i].concepto.find("VISUALIZACIONES") != std::string::npos) {
                int vistas_pmes, vistas_smes, diferencia_vistas;
                string nombre_pmes, nombre_smes;
                switch (pmes) {
                    case 1:
                        nombre_pmes = "enero";
                        vistas_pmes = content[i].enero;
                        break;
                    case 2:
                        nombre_pmes = "febrero";
                        vistas_pmes = content[i].febrero;
                        break;
                    case 3:
                        nombre_pmes = "marzo";
                        vistas_pmes = content[i].marzo;
                        break;
                    case 4:
                        nombre_pmes = "abril";
                        vistas_pmes = content[i].abril;
                        break;
                    case 5:
                        nombre_pmes = "mayo";
                        vistas_pmes = content[i].mayo;
                        break;
                    case 6:
                        nombre_pmes = "junio";
                        vistas_pmes = content[i].junio;
                        
                    
                        break;
                }
                switch (smes) {
                    case 1:
                        nombre_smes = "enero";
                        vistas_smes = content[i].enero;
                        break;
                    case 2:
                        nombre_smes = "febrero";
                        vistas_smes = content[i].febrero;
                        break;
                    case 3:
                        nombre_smes = "marzo";
                        vistas_smes = content[i].marzo;
                        break;
                    case 4:
                        nombre_smes = "abril";
                        vistas_smes = content[i].abril;
                        break;
                    case 5:
                        nombre_smes = "mayo";
                        vistas_smes = content[i].mayo;
                        break;
                    case 6:
                        nombre_smes = "junio";
                        vistas_smes = content[i].junio;
                        break;
                }

                diferencia_vistas = vistas_smes - vistas_pmes;
                cout << "Diferencia " << nombre_pmes << " (" << vistas_pmes << ") y " << nombre_smes << " (" << vistas_smes << ") es: " << diferencia_vistas << '\n';
            }
        }
    }

    cout << '\n';

    int protwitter = 0, profb;

    for(int i = 0; i < content.size(); i++) {
        if(content[i].redesSoc == "TWITTER" && content[i].concepto.find("SEGUIDORES") != std::string::npos) {
            protwitter = content[i].enero + content[i].febrero + content[i].marzo + content[i].abril + content[i].mayo + content[i].junio;
            cout << "Total: " << protwitter << '\n';
            protwitter = int(protwitter / 6);
        }
        if(content[i].redesSoc == "FACEBOOK" && content[i].concepto.find("SEGUIDORES") != std::string::npos) {
            profb = content[i].enero + content[i].febrero + content[i].marzo + content[i].abril + content[i].mayo + content[i].junio;
            cout << "Total: " << profb << '\n';
            profb= int(profb / 6);
        }
    }

    cout << "Promedio de crecimiento de twitter (enero - junio): " << protwitter << '\n';
    cout << "Promedio de crecimiento de facebook(enero-junio): " << profb << '\n';

}
