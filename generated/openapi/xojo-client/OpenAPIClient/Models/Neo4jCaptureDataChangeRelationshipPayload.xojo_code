#tag Class
Protected Class Neo4jCaptureDataChangeRelationshipPayload

	#tag Property, Flags = &h0
		after As Object
	#tag EndProperty


	#tag Property, Flags = &h0
		before As String
	#tag EndProperty


	#tag Property, Flags = &h0
		Escapedend As OpenAPIClient.Models.Neo4jCaptureDataChangeRelationshipPayloadEnd
	#tag EndProperty


	#tag Property, Flags = &h0
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		label As String
	#tag EndProperty


	#tag Property, Flags = &h0
		start As OpenAPIClient.Models.Neo4jCaptureDataChangeRelationshipPayloadEnd
	#tag EndProperty


	#tag Property, Flags = &h0
		type As String
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="after"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Object"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="before"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Escapedend"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Neo4jCaptureDataChangeRelationshipPayloadEnd"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="label"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="start"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Neo4jCaptureDataChangeRelationshipPayloadEnd"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


