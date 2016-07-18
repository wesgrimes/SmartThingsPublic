/**
 *  Audio Switch Zone On, When On
 *
 *  Author: Wes Grimes
 */
definition(
    name: "Audio Zone Switch Level",
    namespace: "wesgrimes",
    author: "Wes Grimes",
    description: "Enable and set the level of an audio zone",
    category: "Convenience",
    iconUrl: "https://s3.amazonaws.com/smartapp-icons/Meta/light_contact-outlet.png",
    iconX2Url: "https://s3.amazonaws.com/smartapp-icons/Meta/light_contact-outlet@2x.png"
)

preferences {
	section ("When the switch turns on...") {
		input "switch1", "capability.switchLevel", title: "Switch"
	}
	section ("Enable an Audio Switch Zone...") {
		input "audioSwitch1", "capability.actuator", title: "Audio Switch"
		input(name: "zone", type: "enum", title: "Zone", options: ["1","2","3","4","5","6","7","8","9","10"])
	}
}

def installed()
{
	log.debug "installed"
	subscribe(switch1, "level", levelHandler)
	subscribe(switch1, "switch", switchHandler)    

	String sZone = String.format("%02d", settings.zone.toInteger())

	subscribe(audioSwitch1, "zoneLevel${sZone}", zoneLevelHandler) 
	subscribe(audioSwitch1, "zoneEnabled${sZone}", zoneEnabledHandler) 
}

def updated()
{
	log.debug "updated"

	unsubscribe()

	subscribe(switch1, "level", levelHandler)
	subscribe(switch1, "switch", switchHandler)

	String sZone = String.format("%02d", settings.zone.toInteger())

	subscribe(audioSwitch1, "zoneLevel${sZone}", zoneLevelHandler) 
	subscribe(audioSwitch1, "zoneEnabled${sZone}", zoneEnabledHandler) 
}

def switchHandler(evt) {
    if (evt.value == "on") {
        log.debug "switch turned on!  Zone:$settings.zone"

		switch (settings.zone)
        {
        	case "1": 
            	audioSwitch1.setZoneEnabled01_On()
                break
        	case "2": 
            	audioSwitch1.setZoneEnabled02_On()
                break
        	case "3": 
            	audioSwitch1.setZoneEnabled03_On()
                break
        	case "4": 
            	audioSwitch1.setZoneEnabled04_On()
                break
        	case "5": 
            	audioSwitch1.setZoneEnabled05_On()
                break
        	case "6": 
            	audioSwitch1.setZoneEnabled06_On()
                break
        	case "7": 
            	audioSwitch1.setZoneEnabled07_On()
                break
        	case "8": 
            	audioSwitch1.setZoneEnabled08_On()
                break
        	case "9": 
            	audioSwitch1.setZoneEnabled09_On()
                break
        	case "10": 
            	audioSwitch1.setZoneEnabled10_On()
                break
        }
    } else if (evt.value == "off") {
        log.debug "switch turned off!  Zone:$settings.zone"
        switch (settings.zone)
        {
        	case "1": 
            	audioSwitch1.setZoneEnabled01_Off()
                break
        	case "2": 
            	audioSwitch1.setZoneEnabled02_Off()
                break
        	case "3": 
            	audioSwitch1.setZoneEnabled03_Off()
                break
        	case "4": 
            	audioSwitch1.setZoneEnabled04_Off()
                break
        	case "5": 
            	audioSwitch1.setZoneEnabled05_Off()
                break
        	case "6": 
            	audioSwitch1.setZoneEnabled06_Off()
                break
        	case "7": 
            	audioSwitch1.setZoneEnabled07_Off()
                break
        	case "8": 
            	audioSwitch1.setZoneEnabled08_Off()
                break
        	case "9": 
            	audioSwitch1.setZoneEnabled09_Off()
                break
        	case "10": 
            	audioSwitch1.setZoneEnabled10_Off()
                break
        }
    }
}

def levelHandler(evt) {
	log.debug "levelHandler called. Zone${settings.zone} Level:${evt.value}"
    int level = (int)evt.value.toBigDecimal()
    log.debug "level:${level}"
    

	log.debug "Dimmer value changed. Zone:${settings.zone} level:${level}"
    
    switch (settings.zone)
    {
        case "1": 
        audioSwitch1.setZoneLevel01(level)
        break
        case "2": 
        audioSwitch1.setZoneLevel02(level)
        break
        case "3": 
        audioSwitch1.setZoneLevel03(level)
        break
        case "4": 
        audioSwitch1.setZoneLevel04(level)
        break
        case "5": 
        audioSwitch1.setZoneLevel05(level)
        break
        case "6": 
        audioSwitch1.setZoneLevel06(level)
        break
        case "7": 
        audioSwitch1.setZoneLevel07(level)
        break
        case "8": 
        audioSwitch1.setZoneLevel08(level)
        break
        case "9": 
        audioSwitch1.setZoneLevel09(level)
        break
        case "10": 
        audioSwitch1.setZoneLevel10(level)
        break
    }
    
}

def zoneLevelHandler(evt) {
	int level = evt.value.toInteger()
    
	log.debug "zoneLevelHandler! Zone:${settings.zone} level:${level}"

    switch1.setLevel(level)
}

def zoneEnabledHandler(evt) {


	if(evt.value == "1") {
		log.debug "zoneEnabledHandler turned on. zone:${settings.zone}"

    	switch1.on()
    }
    else {
		log.debug "zoneEnabledHandler turned off. zone:${settings.zone}"

    	switch1.off()
    }
}

