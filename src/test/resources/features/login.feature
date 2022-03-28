#language: es
@LOGIN
Característica: : Login en saucedemo
  Yo como usuario de SauceDemo
  Quiero ingresar a la plataforma
  Para buscar productos

  @HAPPY_PATH
    Escenario: Hacer login con credenciales invalidas
    Dado que estoy en la plataforma de MyStore
      Cuando hago click en el boton sign in
      Y ingreso las credenciales del usuario
        | email                 | pass           |
        | jeancolonia@gmail.com | jeancolonia123 |
    Entonces se debería validar que se muestra el mensaje de error "There is 1 error"
