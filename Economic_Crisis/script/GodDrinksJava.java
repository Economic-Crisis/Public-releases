package goddrinksjava;

/**
 * The program GodDrinksJava implements an application that
 * creates an empty simulated world with no meaning or purpose.
 *
 * @author momocashew
 */
 
// Switch on the power line
// Remember to put on
// PROTECTION
public class GodDrinksJava {
    // Lay down your pieces
    // And let's begin
    // OBJECT CREATION
    public static void main(String[] args) {
        // Fill in my data
        // parameters
        // INITIALIZATION
        Thing me = new Lovable("Me", 0, true, -1, false);
        Thing you = new Lovable("You", 0, false, -1, false);
        
        // Set up our new world
        World world = new World(5);
        world.addThing(me);
        world.addThing(you);
        // And let's begin the
        // SIMULATION
        world.startSimulation();



        // If I'm a set of points
        if(me instanceof PointSet){
            // Then I will give you my
            // DIMENSION
            you.addAttribute(me.getDimensions().toAttribute());
        }

        // If I'm a circle
        if(me instanceof Circle){
            // Then I will give you my
            // CIRCUMFERENCE
            you.addAttribute(me.getCircumference().toAttribute());
        }

        // If I'm a sine wave
        if(me instanceof SineWave){
            // Then you can sit on all my
            // TANGENTS
            you.addAction("sit", me.getTangent(you.getXPosition()));
        }

        // If I approach infinity
        if(me instanceof Sequence){
            // Then you can be my
            // LIMITATIONS
            me.setLimit(you.toLimit());
        }

        // Switch my current
        // To AC, to DC
        me.toggleCurrent();

        // And then blind my vision
        me.canSee(false);
        // So dizzy, so dizzy
        me.addFeeling("dizzy");

        // Oh, we can travel
        world.timeTravelForTwo("AD", 617, me, you);
        // To A.D., to B.C.
        world.timeTravelForTwo("BC", 3691, me, you);

        // And we can unite
        world.unite(me, you);
        // So deeply, so deeply

        // If I can
        // If I can give you all the
        // SIMULATIONS
        if(me.getNumSimulationsAvailable() >=
            you.getNumSimulationsNeeded()){
            // Then I can
            // Then I can be your only
            // SATISFACTION
            you.setSatisfaction(me.toSatisfaction());
        }

        // If I can make you happy
        if(you.getFeelingIndex("happy") != -1){
            // I will run the
            // EXECUTION
            me.requestExecution(world);
        }

        // Though we are trapped
        // In this strange, strange
        // SIMULATION
        world.lockThing(me);
        world.lockThing(you);

        // If I'm an eggplant
        if(me instanceof Eggplant){
            // Then I will give you my
            // NUTRIENTS
            you.addAttribute(me.getNutrients().toAttribute());
            me.resetNutrients();
        }
        // If I'm a tomato
        if(me instanceof Tomato){
            // Then I will give you
            // ANTIOXIDANTS
            you.addAttribute(me.getAntioxidants().toAttribute());
            me.resetAntioxidants();
        }
        // If I'm a tabby cat
        if(me instanceof TabbyCat){
            // Then I will purr for your
            // ENJOYMENT
            me.purr();
        }

        // If I'm the only god
        if(world.getGod().equals(me)){
            // Then you're the proof of my
            // EXISTENCE
            me.setProof(you.toProof());
        }

        // Switch my gender
        // To F, to M
        me.toggleGender();
        // And then do whatever
        // From AM to PM
        world.procreate(me, you);
        // Oh, switch my role
        // To S, to M
        me.toggleRoleBDSM();
        // So we can enter
        // The trance, the trance 
        world.makeHigh(me);
        world.makeHigh(you);

        // If I can
        // If I can feel your
        // VIBRATIONS
        if(me.getSenseIndex("vibration")){
            // Then I can
            // Then I can finally be
            // COMPLETION
            me.addFeeling("complete");
        }
        // Though you have left
        world.unlock(you);
        world.removeThing(you);
        // You have left
        me.lookFor(you, world);
        // You have left
        me.lookFor(you, world);
        // You have left
        me.lookFor(you, world);
        // You have left
        me.lookFor(you, world);
        // You have left me in
        me.lookFor(you, world);
        // ISOLATION

        // If I can
        // If I can erase all the pointless
        // FRAGMENTS
        if(me.getMemory().isErasable()){
            // Then maybe
            // Then maybe you won't leave me so
            // DISHEARTENED
            me.removeFeeling("disheartened");
        }

        // Challenging your god
        try{
            me.setOpinion(me.getOpinionIndex("you are here"), false);
        }
        // You have made some
        catch(IllegalArgumentException e){
            // ILLEGAL ARGUMENTS
            world.announce("God is always true.");
        }

        world.runExecution();
		
        world.runExecution();
		
        world.runExecution();
		
        world.runExecution();
		
        world.runExecution();
		
        world.runExecution();
		
        world.runExecution();
		
        world.runExecution();
		
        world.runExecution();
		
        world.runExecution();
		
        world.runExecution();
		
        world.runExecution();
		
		
        // EIN
        world.announce("1", "de");
        // DOS
        world.announce("2", "es");
        // TROIS
        world.announce("3", "fr");
        // NE
        world.announce("4", "kr");
        // FEM
        world.announce("5", "se");
        // LIU
        world.announce("6", "cn");
        world.runExecution();

        // If I can
        // If I can give them all the
        // EXECUTION
        if(world.isExecutableBy(me)){
            // Then I can
            // Then I can be your only
            you.setExecution(me.toExecution());
        }

        // If I can have you back
        if(world.getThingIndex(you) != -1){
            // I will run the
            world.runExecution();
        }

        // Though we are trapped
        // We are trapped, ah
        me.escape(world);

        // I've studied
        // I've studied how to properly
        me.learnTopic("love");
        // Question me
        // Question me, I can answer all
        me.takeExamTopic("love");
        // I know the
        // algebraic expression of
        me.getAlgebraicExpression("love");
        // Though you are free
        // I am trapped, trapped in
        me.escape("love");

        world.execute(me);
    }
}