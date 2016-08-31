Feature: Facebook

  Scenario: Entramos a https://www.facebook.com/
  
		Given Ingreso el mail mpizarrob20@gmail.com en el campo mail       
    And Ingreso "Kubanit47842" en el campo pass
    When Pulso el boton iniciar sesion
    Then Se ingresa al perfil del usuario