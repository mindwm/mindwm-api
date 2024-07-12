
/*
 * ClipboardPayload_context.h
 *
 * Selection context
 */

#ifndef TINY_CPP_CLIENT_ClipboardPayload_context_H_
#define TINY_CPP_CLIENT_ClipboardPayload_context_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Selection context
 *
 *  \ingroup Models
 *
 */

class ClipboardPayload_context{
public:

    /*! \brief Constructor.
	 */
    ClipboardPayload_context();
    ClipboardPayload_context(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ClipboardPayload_context();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get window id
	 */
	std::string getWindow();

	/*! \brief Set window id
	 */
	void setWindow(std::string  window);


    private:
    std::string window{};
};
}

#endif /* TINY_CPP_CLIENT_ClipboardPayload_context_H_ */
