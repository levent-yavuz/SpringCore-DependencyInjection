# XML-Based Configuration

## Constructor Injection

### Team Class
```
private String name;
private String nickName;
private String shirtColor;
private int championshipsWon;
private List<Player> players;
 
public Team(String name, String nickName, String shirtColor, int championshipsWon, List<Player> players) {
  super();
  this.name = name;
  this.nickName = nickName;
  this.shirtColor = shirtColor;
  this.championshipsWon = championshipsWon;
  this.players = players;
}
  
public Team() { // default constructor
  super();
}
 ```
 ### Player Class
 ```
private String name;
private String surname;
private int age;
  ```
  ### constructor.injection.context.xml
  ```
  <bean id="teamId" class="com.levent.constructor.injection.model.Team" >  
		<constructor-arg name="name" value="Machester City"></constructor-arg>
		<constructor-arg name="nickName" value="The Sky Blues"></constructor-arg>
		<constructor-arg name="shirtColor" value="Blue and White"></constructor-arg>
		<constructor-arg name="championshipsWon" value="6"></constructor-arg>
		<constructor-arg name="name" value="Machester City"></constructor-arg>
		<constructor-arg name="players">
			<list>
				<bean id="player1" class="com.levent.constructor.injection.model.Player">
					<property name="name" value="Phil"></property>
					<property name="surname" value="Foden"></property>
					<property name="age" value="20"></property>
				</bean>
				<bean id="player2" class="com.levent.constructor.injection.model.Player">
						<property name="name" value="Bernardo"></property>
						<property name="surname" value="Silva"></property>
						<property name="age" value="28"></property>
				</bean>
				<bean id="player3" class="com.levent.constructor.injection.model.Player">
					<property name="name" value="Ilkay"></property>
					<property name="surname" value="Gundogan"></property>
					<property name="age" value="31"></property>
				</bean>
			</list>
		</constructor-arg>
	</bean >
</beans>
```
### Test Class and Output
```
ApplicationContext context = new ClassPathXmlApplicationContext("constructor.injection.context.xml");
Team manchesterCity = context.getBean("teamId", Team.class);
System.out.println(manchesterCity);
```
    Team [name=Machester City, nickName=The Sky Blues, shirtColor=Blue and White, championshipsWon=6, player=[
      Player [name=Phil, surname=Foden, age=20], 
      Player [name=Bernardo, surname=Silva, age=28], 
      Player [name=Ilkay, surname=Gundogan, age=31]]]

## Setter Injection
### Team Class
```
private String name;
private String nickName;
private String shirtColor;
private int championshipsWon;
private Player player;
//setters and getters...
  ```
### Player Class
 ```
private String name;
private String surname;
private int age;
//setters and getters...
  ```
### setter.injection.context.xml
  ```
  <bean id="teamId" class="com.levent.setter.injection.model.Team" >  
		<property name="name" value="Machester City"></property>
		<property name="nickName" value="The Sky Blues"></property>
		<property name="shirtColor" value="Blue and White"></property>
		<property name="championshipsWon" value="6"></property>
		<property name="player" ref="playerId"></property>
	</bean >
	
	<bean id="playerId" class="com.levent.setter.injection.model.Player">
		<property name="name" value="Phil"></property>
		<property name="surname" value="Foden"></property>
		<property name="age" value="22"></property>
	</bean>
  ```
  ### Test Class and Output
```
ApplicationContext context = new ClassPathXmlApplicationContext("setter.injection.context.xml");
Team manchesterCity = context.getBean("teamId", Team.class);
System.out.println(manchesterCity);
```
Team [name=Machester City, nickName=The Sky Blues, shirtColor=Blue and White, championshipsWon=6, player=Player [name=Phil, surname=Foden, age=22]]
