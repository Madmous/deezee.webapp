class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        //"/"(view:"/index")


        "/"(controller: 'client', action: "index")
        "/login/$action?"(controller: "login")
        "/logout/$action?"(controller: "logout")
        "500"(view: '/error')
        "505"(view: '/error505')
        "400"(view: '/error400')
        "404"(view: '/error404')
	}
}
