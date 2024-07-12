
/*
 * TmuxPaneIoDocument.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TmuxPaneIoDocument_H_
#define TINY_CPP_CLIENT_TmuxPaneIoDocument_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TmuxPaneIoDocument{
public:

    /*! \brief Constructor.
	 */
    TmuxPaneIoDocument();
    TmuxPaneIoDocument(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TmuxPaneIoDocument();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get User input
	 */
	std::string getInput();

	/*! \brief Set User input
	 */
	void setInput(std::string  input);
	/*! \brief Get Command output (mix of stdout & stderr)
	 */
	std::string getOutput();

	/*! \brief Set Command output (mix of stdout & stderr)
	 */
	void setOutput(std::string  output);
	/*! \brief Get ps1 (prompt) AFTER the input and output
	 */
	std::string getPs1();

	/*! \brief Set ps1 (prompt) AFTER the input and output
	 */
	void setPs1(std::string  ps1);


    private:
    std::string input{};
    std::string output{};
    std::string ps1{};
};
}

#endif /* TINY_CPP_CLIENT_TmuxPaneIoDocument_H_ */
