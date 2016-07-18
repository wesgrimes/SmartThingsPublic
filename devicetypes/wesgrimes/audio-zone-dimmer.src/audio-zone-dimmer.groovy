metadata {
        definition (name: "Audio Zone Dimmer", namespace: "wesgrimes", author: "Wes Grimes") {
        capability "capability.switch"
        capability "capability.refresh"
        capability "capability.switchLevel"
    }

	// simulator metadata
	simulator {
	}

	// UI tile definitions
	tiles(scale: 2) {
		standardTile("button", "device.switch", width: 3, height: 3, canChangeIcon: true) {
			state "off", label: 'Off', action: "switch.on", icon: "st.Kids.kid10", backgroundColor: "#ffffff", nextState: "on"
			state "on", label: 'On', action: "switch.off", icon: "st.Kids.kid10", backgroundColor: "#79b821", nextState: "off"
		}
		standardTile("refresh", "device.switch", inactiveLabel: false, decoration: "flat", height: 3, width: 3) {
			state "default", label:'', action:"refresh.refresh", icon:"st.secondary.refresh"
		}        
        controlTile("levelSliderControl", "device.level", "slider", height: 2, width: 6, inactiveLabel: false, backgroundColor:"#ffe71e", range:"(1..10)") {
            state "level", action:"switch level.setLevel"
        }

		main(["button"])
		details(["button", "refresh", "levelSliderControl"])
	}
}

def parse(String description) {
    def events = []
	
    log.debug "virtual dimmer parse: ${description}"
    //events << createEvent(name:"switch", value: "on")
	
    return events
}

def on() {
	sendEvent(name: "switch", value: "on")
    //log.info "Dimmer On"
}

def off() {
	sendEvent(name: "switch", value: "off")
    //log.info "Dimmer Off"
}

def setLevel(val){
    //log.info "setLevel $val"
    
    if (val < 1) val = 1
    else if( val > 10) val = 10
    
 	sendEvent(name: "level", value: val)
}

def refresh() {
    //log.info "refresh"
}
