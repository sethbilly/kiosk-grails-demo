class UrlMappings {

	static mappings = {

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index1")
        "500"(view:'/error')
        "/api/products"(resources: "product")
        "/api/persons"(resources: "person")
        "/api/customers"(resources: "customer")
	}
}
