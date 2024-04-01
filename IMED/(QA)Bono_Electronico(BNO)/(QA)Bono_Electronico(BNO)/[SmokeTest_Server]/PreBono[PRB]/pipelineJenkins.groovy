node{
    def SOURCE= 'C:/SmokeTest_Server/Core/(QA)Bono_Electronico(BNO)/PreBono[PRB]'
    def FECHAHOY= new Date().format('yyyy-MM-dd').toString()

    def nodo = "soatest"
    stage('Init') {
        node(nodo) {
            bat '''
            EXIT /B 0
            '''
        }
    }
    
    def stages = [
        ['Nombre' : '[PreBono[PRB]/5CAP-DEC/api/v1/auth/validate_vigencia] (QA-1816)', 'Ruta' : 'C:\\Users\\parasoft\\parasoft\\soavirt_workspace\\TestAssets\\(QA)Bono_Electronico(BNO)\\[SmokeTest_Server]\\PreBono[PRB]\\5CAP-DEC\\api\\v1\\auth\\validate_vigencia\\SmokeTestExe.bat'],
        ['Nombre' : '[PreBono[PRB]/API-BENIFCOMP-BONO-QA-IMED/api/v1/atributos_companias] (QA-1813, QA-1814)', 'Ruta' : 'C:\\Users\\parasoft\\parasoft\\soavirt_workspace\\TestAssets\\(QA)Bono_Electronico(BNO)\\[SmokeTest_Server]\\PreBono[PRB]\\API-BENIFCOMP-BONO-QA-IMED\\api\\v1\\atributos_companias\\SmokeTestExe.bat'],
        ['Nombre' : '[PreBono[PRB]/API-VALIDA-CI-BONO-QA-IMED/api/v1/valida-ci] (QA-1815, QA-1817, QA-1818, QA-1819)', 'Ruta' : 'C:\\Users\\parasoft\\parasoft\\soavirt_workspace\\TestAssets\\(QA)Bono_Electronico(BNO)\\[SmokeTest_Server]\\PreBono[PRB]\\API-VALIDA-CI-BONO-QA-IMED\\api\\v1\\valida-ci\\SmokeTestExe.bat'],
        ['Nombre' : '[PreBono[PRB]/WS-PREBONO3-QA-BONOELECTRONICO/rest-activacionbono] (QA-1788)', 'Ruta' : 'C:\\Users\\parasoft\\parasoft\\soavirt_workspace\\TestAssets\\(QA)Bono_Electronico(BNO)\\[SmokeTest_Server]\\PreBono[PRB]\\WS-PREBONO3-QA-BONOELECTRONICO\\rest-activacionbono\\SmokeTestExe.bat'],
        ['Nombre' : '[PreBono[PRB]/WS-PREBONO3-QA-BONOELECTRONICO/rest-anulacionbono] (QA-1796)', 'Ruta' : 'C:\\Users\\parasoft\\parasoft\\soavirt_workspace\\TestAssets\\(QA)Bono_Electronico(BNO)\\[SmokeTest_Server]\\PreBono[PRB]\\WS-PREBONO3-QA-BONOELECTRONICO\\rest-anulacionbono\\SmokeTestExe.bat'],
        ['Nombre' : '[PreBono[PRB]/WS-PREBONO3-QA-BONOELECTRONICO/rest-conprebono] (QA-1797, QA-1810)', 'Ruta' : 'C:\\Users\\parasoft\\parasoft\\soavirt_workspace\\TestAssets\\(QA)Bono_Electronico(BNO)\\[SmokeTest_Server]\\PreBono[PRB]\\WS-PREBONO3-QA-BONOELECTRONICO\\rest-conprebono\\SmokeTestExe.bat'],
        ['Nombre' : '[PreBono[PRB]/WS-PREBONO3-QA-BONOELECTRONICO/rest-conprebonoactoventa] (QA-1812)', 'Ruta' : 'C:\\Users\\parasoft\\parasoft\\soavirt_workspace\\TestAssets\\(QA)Bono_Electronico(BNO)\\[SmokeTest_Server]\\PreBono[PRB]\\WS-PREBONO3-QA-BONOELECTRONICO\\rest-conprebonoactoventa\\SmokeTestExe.bat'],
        ['Nombre' : '[PreBono[PRB]/WS-PREBONO3-QA-BONOELECTRONICO/rest-conprestacionfonasa] (QA-1811)', 'Ruta' : 'C:\\Users\\parasoft\\parasoft\\soavirt_workspace\\TestAssets\\(QA)Bono_Electronico(BNO)\\[SmokeTest_Server]\\PreBono[PRB]\\WS-PREBONO3-QA-BONOELECTRONICO\\rest-conprestacionfonasa\\SmokeTestExe.bat'],
        ['Nombre' : '[PreBono[PRB]/WS-PREBONO3-QA-BONOELECTRONICO/rest-cotizarprebono-api] (QA-10093, QA-10096, QA-10097, QA-10098, QA-10100, QA-10102, QA-10105)', 'Ruta' : 'C:\\Users\\parasoft\\parasoft\\soavirt_workspace\\TestAssets\\(QA)Bono_Electronico(BNO)\\[SmokeTest_Server]\\PreBono[PRB]\\WS-PREBONO3-QA-BONOELECTRONICO\\rest-cotizarprebono-api\\SmokeTestExe.bat'],
        ['Nombre' : '[PreBono[PRB]/WS-PREBONO3-QA-BONOELECTRONICO/rest-emiboncloud] (QA-1782)', 'Ruta' : 'C:\\Users\\parasoft\\parasoft\\soavirt_workspace\\TestAssets\\(QA)Bono_Electronico(BNO)\\[SmokeTest_Server]\\PreBono[PRB]\\WS-PREBONO3-QA-BONOELECTRONICO\\rest-emiboncloud\\SmokeTestExe.bat'],
        ['Nombre' : '[PreBono[PRB]/WS-PREBONO3-QA-BONOELECTRONICO/rest-genprebono] (QA-1753, QA-1754, QA-1755, QA-1756, QA-1757, QA-1758, QA-1759, QA-1760, QA-1775, QA-1795, QA-7502, QA-7505, QA-7510, QA-7513, QA-7600, QA-7603, QA-7605, QA-7607, QA-7608, QA-7610, QA-7611, QA-8042, QA-8043, QA-8044, QA-8045, QA-8046, QA-8047, QA-8054, QA-8056, QA-8086, QA-8087, QA-8126, QA-8160)', 'Ruta' : 'C:\\Users\\parasoft\\parasoft\\soavirt_workspace\\TestAssets\\(QA)Bono_Electronico(BNO)\\[SmokeTest_Server]\\PreBono[PRB]\\WS-PREBONO3-QA-BONOELECTRONICO\\rest-genprebono\\SmokeTestExe.bat'],
        ['Nombre' : '[PreBono[PRB]/WS-PREBONO3-QA-BONOELECTRONICO/rest-pagboncloud] (QA-1776)', 'Ruta' : 'C:\\Users\\parasoft\\parasoft\\soavirt_workspace\\TestAssets\\(QA)Bono_Electronico(BNO)\\[SmokeTest_Server]\\PreBono[PRB]\\WS-PREBONO3-QA-BONOELECTRONICO\\rest-pagboncloud\\SmokeTestExe.bat']
    ]

    def htmlReports = [
        ['reportFiles': 'Prebono[PRB]-ENV.tst/index.html', 'reportName': 'Prebono[PRB]-ENV.tst'],
        ['reportFiles': 'QA-1753/index.html', 'reportName': 'QA-1753'],
        ['reportFiles': 'QA-1754/index.html', 'reportName': 'QA-1754'],
        ['reportFiles': 'QA-1755/index.html', 'reportName': 'QA-1755'],
        ['reportFiles': 'QA-1756/index.html', 'reportName': 'QA-1756'],
        ['reportFiles': 'QA-1757/index.html', 'reportName': 'QA-1757'],
        ['reportFiles': 'QA-1758/index.html', 'reportName': 'QA-1758'],
        ['reportFiles': 'QA-1759/index.html', 'reportName': 'QA-1759'],
        ['reportFiles': 'QA-1760/index.html', 'reportName': 'QA-1760'],
        ['reportFiles': 'QA-1775/index.html', 'reportName': 'QA-1775'],
        ['reportFiles': 'QA-1776/index.html', 'reportName': 'QA-1776'],
        ['reportFiles': 'QA-1782/index.html', 'reportName': 'QA-1782'],
        ['reportFiles': 'QA-1788/index.html', 'reportName': 'QA-1788'],
        ['reportFiles': 'QA-1795/index.html', 'reportName': 'QA-1795'],
        ['reportFiles': 'QA-1796/index.html', 'reportName': 'QA-1796'],
        ['reportFiles': 'QA-1797/index.html', 'reportName': 'QA-1797'],
        ['reportFiles': 'QA-1810/index.html', 'reportName': 'QA-1810'],
        ['reportFiles': 'QA-1811/index.html', 'reportName': 'QA-1811'],
        ['reportFiles': 'QA-1812/index.html', 'reportName': 'QA-1812'],
        ['reportFiles': 'QA-1813/index.html', 'reportName': 'QA-1813'],
        ['reportFiles': 'QA-1814/index.html', 'reportName': 'QA-1814'],
        ['reportFiles': 'QA-1815/index.html', 'reportName': 'QA-1815'],
        ['reportFiles': 'QA-1816/index.html', 'reportName': 'QA-1816'],
        ['reportFiles': 'QA-1817/index.html', 'reportName': 'QA-1817'],
        ['reportFiles': 'QA-1818/index.html', 'reportName': 'QA-1818'],
        ['reportFiles': 'QA-1819/index.html', 'reportName': 'QA-1819'],
        ['reportFiles': 'QA-7502/index.html', 'reportName': 'QA-7502'],
        ['reportFiles': 'QA-7505/index.html', 'reportName': 'QA-7505'],
        ['reportFiles': 'QA-7510/index.html', 'reportName': 'QA-7510'],
        ['reportFiles': 'QA-7513/index.html', 'reportName': 'QA-7513'],
        ['reportFiles': 'QA-7600/index.html', 'reportName': 'QA-7600'],
        ['reportFiles': 'QA-7603/index.html', 'reportName': 'QA-7603'],
        ['reportFiles': 'QA-7605/index.html', 'reportName': 'QA-7605'],
        ['reportFiles': 'QA-7607/index.html', 'reportName': 'QA-7607'],
        ['reportFiles': 'QA-7608/index.html', 'reportName': 'QA-7608'],
        ['reportFiles': 'QA-7610/index.html', 'reportName': 'QA-7610'],
        ['reportFiles': 'QA-7611/index.html', 'reportName': 'QA-7611'],
        ['reportFiles': 'QA-8042/index.html', 'reportName': 'QA-8042'],
        ['reportFiles': 'QA-8043/index.html', 'reportName': 'QA-8043'],
        ['reportFiles': 'QA-8044/index.html', 'reportName': 'QA-8044'],
        ['reportFiles': 'QA-8045/index.html', 'reportName': 'QA-8045'],
        ['reportFiles': 'QA-8046/index.html', 'reportName': 'QA-8046'],
        ['reportFiles': 'QA-8047/index.html', 'reportName': 'QA-8047'],
        ['reportFiles': 'QA-8054/index.html', 'reportName': 'QA-8054'],
        ['reportFiles': 'QA-8056/index.html', 'reportName': 'QA-8056'],
        ['reportFiles': 'QA-8086/index.html', 'reportName': 'QA-8086'],
        ['reportFiles': 'QA-8087/index.html', 'reportName': 'QA-8087'],
        ['reportFiles': 'QA-8126/index.html', 'reportName': 'QA-8126'],
        ['reportFiles': 'QA-8160/index.html', 'reportName': 'QA-8160'],
        ['reportFiles': 'QA-10093/index.html', 'reportName': 'QA-10093'],
        ['reportFiles': 'QA-10096/index.html', 'reportName': 'QA-10096'],
        ['reportFiles': 'QA-10097/index.html', 'reportName': 'QA-10097'],
        ['reportFiles': 'QA-10098/index.html', 'reportName': 'QA-10098'],
        ['reportFiles': 'QA-10100/index.html', 'reportName': 'QA-10100'],
        ['reportFiles': 'QA-10102/index.html', 'reportName': 'QA-10102'],
        ['reportFiles': 'QA-10105/index.html', 'reportName': 'QA-10105']
    ]

    
    stages.each{ stageName ->
        stage(stageName['Nombre']) {
            // Especifica el nodo para este stage
            def RUTA = stageName['Ruta']
            node(nodo){
                bat """
                call "${RUTA}" > "C:\\SmokeTest_Server\\Core\\(QA)Bono_Electronico(BNO)\\PreBono[PRB]\\smoketest.log"
                EXIT /B 0
                """
                script {
                    FAILURECOUNT = readFile("C:\\SmokeTest_Server\\Core\\(QA)Bono_Electronico(BNO)\\PreBono[PRB]\\smoketest.log").trim()
                    def matcher = (FAILURECOUNT =~ /Failure Count = (\d+)/)
                    if (matcher) {
                        FAILURECOUNT = matcher[0][1]
                    }
                    if(FAILURECOUNT.toInteger() > 0){
                        unstable("Errores encontrados en la ejecución: ${FAILURECOUNT}")
                    }
                }
            }
        }
    }
    stage('Publicar Reportes') {
        node(nodo) { 
            script {
                htmlReports.each { report ->
                    publishHTML(
                        [
                            allowMissing: false,
                            alwaysLinkToLastBuild: true,
                            keepAll: true,
                            reportDir: "${SOURCE}/${FECHAHOY}/[Smoketest]/",
                            reportFiles: report['reportFiles'],
                            reportName: report['reportName'],
                            reportTitles: 'Imed Report'
                        ]
                    )
                }
            }
        }
    }
}